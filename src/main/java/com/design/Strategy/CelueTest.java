package com.design.Strategy;

/**
 * @author wenhe
 * @date 2020/8/9 13:19
 */
public class CelueTest {
    public static void main(String[] args) {
        Operator operator =new Operator(new Add());
        operator.getJIeguo(10,5);
    }
}
