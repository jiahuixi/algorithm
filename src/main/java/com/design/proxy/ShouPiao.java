package com.design.proxy;

/**
 * @author wenhe
 * @date 2020/8/9 12:45
 */
public class ShouPiao implements BuyTicket{



    @Override
    public void buyTIcket() {
        System.out.println("我找黄牛买票，你得加钱");
        new HuoCheZhan().buyTIcket();
    }
}
