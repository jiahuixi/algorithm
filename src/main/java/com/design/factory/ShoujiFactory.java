package com.design.factory;

/**
 * @author wenhe
 * @date 2020/8/9 12:52
 */
public class ShoujiFactory extends  AbstractFactory{
    @Override
    public Shouji getShouji(String type) {
        switch (type) {
            case "huawei":
                return new HuaweiShouji();
            case "pingguo":
                return new Pingguo();
            default:
                return null;
        }


    }

    @Override
    public ShoujiKe getShoujiKe(String type) {
        return null;
    }
}
