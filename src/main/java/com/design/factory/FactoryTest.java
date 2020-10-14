package com.design.factory;

/**
 * @author wenhe
 * @date 2020/8/9 12:55
 */
public class FactoryTest {
    public static void main(String[] args) {
        Shouji shouji = new ShoujiFactory().getShouji("huawei");
        shouji.getShoujiName();
    }
}
