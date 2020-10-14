package com.design.singleton;

/**
 * @author wenhe
 * @date 2020/8/9 12:38
 */
public class Singleton2 {
    private static Singleton2 instance = new Singleton2();


    public static Singleton2 getInstance() {
        return instance;
    }
}
