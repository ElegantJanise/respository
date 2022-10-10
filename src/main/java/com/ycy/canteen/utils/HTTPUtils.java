package com.ycy.canteen.utils;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author mayao
 * @ClassName: HTTPUtils
 * @Description: 发送HTTP请求
 * @date 2018年8月23日
 */
public class HTTPUtils {

    public static int TIME_OUT = 30000;
    public static String DEFAULT_CHARSET = "utf-8";

    public static String post(final String uRL, String data) throws Exception {
        long timeOut = 30000;
        URL url = new URL(uRL);

        StringBuffer sb = new StringBuffer("");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setReadTimeout((int) timeOut);
        connection.setConnectTimeout((int) timeOut);
        connection.setDoOutput(true);
        connection.setDoInput(true);
        connection.setRequestMethod("POST");
        connection.setUseCaches(false);
        connection.setRequestProperty("Accept-Charset", DEFAULT_CHARSET);
        connection.setRequestProperty("contentType", DEFAULT_CHARSET);

        connection.setInstanceFollowRedirects(true);
        connection.addRequestProperty("User-Agent", "MSSP-User-Agent");
        connection.setRequestProperty("Content-Type", "application/json");
        try {
            connection.connect();

            // post
            DataOutputStream out = new DataOutputStream(connection.getOutputStream());

            out.write(data.getBytes(DEFAULT_CHARSET));

            out.flush();
            out.close();

            InputStream is;
            if (connection.getResponseCode() != HttpURLConnection.HTTP_OK) {
                connection.disconnect();
                throw new Exception("HTTP ERROR :" + connection.getResponseCode());
            } else {
                is = connection.getInputStream();
            }

            BufferedReader reader = new BufferedReader(new InputStreamReader(is, DEFAULT_CHARSET));
            String lines;
            sb = new StringBuffer("");
            while ((lines = reader.readLine()) != null) {
                sb.append(lines);
            }
            reader.close();

            connection.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();

    }

}


