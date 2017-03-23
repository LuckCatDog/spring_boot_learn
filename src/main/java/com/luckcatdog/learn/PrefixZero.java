package com.luckcatdog.learn;

/**
 * Created by LuckCatDog
 * Date: 2017/3/23
 * Time: 10:29
 * prefix 0 string
 * give a number and return string length, result is string with prefix 0
 * eg: (12,4)--->0012    (123,4)--->0123 (1234,4)--->1234
 */
public class PrefixZero {

    public static final int DEFAULT_STR_LENGTH = 4;

    public static String generateStrWithPrefix(int num) {
        return generateStrWithPrefix(num, DEFAULT_STR_LENGTH);
    }

    public static String generateStrWithPrefix(int number, int len) {
        return String.format("%0" + len + "d", number);
    }
}
