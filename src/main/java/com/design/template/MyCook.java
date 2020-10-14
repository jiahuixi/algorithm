package com.design.template;

/**
 * @author wenhe
 * @date 2020/8/9 13:08
 */
public class MyCook extends CookEgg {
    private boolean addOil = false;
    @Override
    public boolean isAddOil(){
        return addOil;
    }
    @Override
    void addOil() {
        System.out.println("加入100升油");
    }

    @Override
    void addEggs() {
        System.out.println("加入100个鸡蛋");
    }
}
