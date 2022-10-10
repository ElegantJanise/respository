package com.ycy.canteen.utils;


import java.util.Base64;

public class StringUtils {
    
    public static String base64Encode(byte [] data)
    {
    	return new String(Base64.getEncoder().encode(data));
    }
    
    public static byte[] base64Decode(String base64)
    {
    	return Base64.getDecoder().decode(base64);
    }
	
}
