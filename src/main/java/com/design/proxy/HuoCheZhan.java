package com.design.proxy;

/**
 * @author wenhe
 * @date 2020/8/9 12:44
 */
public class HuoCheZhan implements BuyTicket{
    @Override
    public void buyTIcket() {
        System.out.println("买张火车票");
    }
}
