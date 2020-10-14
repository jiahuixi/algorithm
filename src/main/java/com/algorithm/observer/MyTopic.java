package com.algorithm.observer;

/**
 * @author wenhe
 * @date 2020/8/14 14:07
 */
public class MyTopic  extends Topic{

    public void doSomeThing(){
        System.out.println("this is my MyTopic");
        super.notifyMyObserver();
    }

}
