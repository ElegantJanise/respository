package com.ycy.canteen.utils;

import org.springframework.util.DigestUtils;

public class MD5Util {
    public static String encrypt(String str) {
        return DigestUtils.md5DigestAsHex(str.getBytes());
    }
}
