package com.algorithm.observer;

/**
 * @author wenhe
 * @date 2020/8/14 14:08
 */
public class Client {

    public static void main(String[] args) {
        MyTopic myTopic = new MyTopic();

        for(int i = 0 ; i < 10 ; i ++){

            myTopic.addMyObserver(new MyObserver(String.valueOf(i)));
        }

        myTopic.doSomeThing();
    }

}
