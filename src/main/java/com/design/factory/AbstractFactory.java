package com.design.factory;

/**
 * @author wenhe
 * @date 2020/8/9 12:58
 */
public abstract  class AbstractFactory {
    public  abstract Shouji getShouji(String type);
    public  abstract ShoujiKe getShoujiKe(String type);
}
