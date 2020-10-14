package com.design.singleton;

/**
 * @author wenhe
 * @date 2020/8/9 12:36
 */
public class Singleton1 {
    private volatile static Singleton1 instance = null;


    public static Singleton1 getInstance(){
        if(instance==null){
            synchronized(Singleton1.class){
                if(instance==null){
                    return new Singleton1();
                }
             }
        }
        return instance;
    }

}
