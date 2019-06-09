package com.androidwind.image;

import java.text.DecimalFormat;

/**
 * @author  ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class StringUtil {
    /**
     * return if str is empty
     *
     * @param str
     * @return
     */
    public static boolean isEmpty(String str) {
        if (str == null || str.length() == 0 || str.equalsIgnoreCase("null") || str.isEmpty() || str.equals("")) {
            return true;
        } else {
            return false;
        }
    }

    public static String getTrimedString(String s) {
        return trim(s);
    }

    public static String trim(String s) {
        return s == null ? "" : s.trim();
    }

    public static boolean equals(String str1, String str2) {
        return str1 == str2 || equalsNotNull(str1, str2);
    }

    public static boolean equalsNotNull(String str1, String str2) {
        return str1 != null && str1.equals(str2);
    }
}
