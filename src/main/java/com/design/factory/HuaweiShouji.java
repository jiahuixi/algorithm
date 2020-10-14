package com.design.factory;

/**
 * @author wenhe
 * @date 2020/8/9 12:52
 */
public class HuaweiShouji implements Shouji{
    @Override
    public void getShoujiName() {
        System.out.println("我是华为");
    }
}
