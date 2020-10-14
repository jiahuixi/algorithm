package com.algorithm.observer;


import java.util.ArrayList;
import java.util.List;

/**
 * @author wenhe
 * @date 2020/8/14 14:00
 */
public class Topic {
    public List<MyObserver> myObserverList = new ArrayList<>();



    public void addMyObserver(MyObserver myObserver){
        myObserverList.add(myObserver);
    }
    public void removeMyObserver(MyObserver myObserver){
        myObserverList.remove(myObserver);
    }
    public void notifyMyObserver(){

        myObserverList.forEach((myObserver)->myObserver.operator());
    }
}
