package com.design.template;

/**
 * @author wenhe
 * @date 2020/8/9 13:08
 */
public class MomCook extends CookEgg {
    @Override
    void addOil() {
        System.out.println("加入适量升油");
    }

    @Override
    void addEggs() {
        System.out.println("加入适量个鸡蛋");
    }
}
