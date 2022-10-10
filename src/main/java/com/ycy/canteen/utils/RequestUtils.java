package com.ycy.canteen.utils;

import com.google.gson.GsonBuilder;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @ClassName RequestUtils
 **/
public class RequestUtils {

    public static String generateRequestJson(Map<String, String> request, String key) throws Exception {
        String data = generateSignString(request);
        String signature;
        signature = getHMAC(data.getBytes(), key.getBytes(), "HmacSHA256");
        request.put("signature", signature);
        return new GsonBuilder().disableHtmlEscaping().create().toJson(request);
    }

    public static String generateRequestJson2(Map<String, String> request) throws Exception {
        String data = generateSignString(request);
        request.put("signature", data);
        return new GsonBuilder().disableHtmlEscaping().create().toJson(request);
    }

    public static String generateRequestJson3(Map<String, Object> request) throws Exception {
        String data = generateSignString2(request);
        request.put("signature", data);
        return new GsonBuilder().disableHtmlEscaping().create().toJson(request);
    }

    //常量字符串
    private static final String AND = "&";
    private static final String EQUAL = "=";

    /**
     * 生成签名字符串，忽略掉转入的属性名
     *
     * @param props
     * @return
     */
    private static String generateSignString(Map<String, String> props) {
        StringBuilder sb = new StringBuilder();
        List<String> keys = new ArrayList<>(props.keySet());
        Collections.sort(keys);
        for (int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            Object value = props.get(key);
            if (value == null || "signature".equals(key)) {
                continue;
            }
            if (i == props.size() - 1) {// 拼接时，不包括最后一个&字符
                sb.append(key).append(EQUAL).append(value);
            } else {
                sb.append(key).append(EQUAL).append(value).append(AND);
            }
        }
        return sb.toString();
    }

    private static String generateSignString2(Map<String, Object> props) {
        StringBuilder sb = new StringBuilder();
        List<String> keys = new ArrayList<>(props.keySet());
        Collections.sort(keys);
        for (int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            Object value = props.get(key);
            if (value == null || "signature".equals(key)) {
                continue;
            }
            if (i == props.size() - 1) {// 拼接时，不包括最后一个&字符
                sb.append(key).append(EQUAL).append(value);
            } else {
                sb.append(key).append(EQUAL).append(value).append(AND);
            }
        }
        return sb.toString();
    }

    /**
     * base64加密
     *
     * @param data
     * @param key
     * @param HmacAlgo
     * @return
     * @throws Exception
     */
    private static String getHMAC(byte[] data, byte[] key, String HmacAlgo) throws Exception {

        SecretKeySpec signingKey = new SecretKeySpec(key, HmacAlgo);
        Mac mac = Mac.getInstance(HmacAlgo);
        mac.init(signingKey);
        return StringUtils.base64Encode(mac.doFinal(data));

    }

}
