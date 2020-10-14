package com.algorithm.observer;

/**
 * @author wenhe
 * @date 2020/8/14 14:02
 */
public class MyObserver implements IObserver{
    @Override
    public void operator() {
        System.out.println(this.name+"jianting");
    }

    private String name;

    public MyObserver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
