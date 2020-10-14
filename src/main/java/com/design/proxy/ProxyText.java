package com.design.proxy;

/**
 * @author wenhe
 * @date 2020/8/9 12:47
 */
public class ProxyText {
    public static void main(String[] args) {
        BuyTicket buyTicket = new ShouPiao();
        buyTicket.buyTIcket();
    }
}
