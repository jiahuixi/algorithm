package com.design.template;

/**
 * @author wenhe
 * @date 2020/8/9 13:07
 */
public abstract  class CookEgg {
    abstract void addOil();
    abstract void addEggs();
    public boolean isAddOil(){
        return true;
    }
    public final void cook(){
        if(isAddOil()){
            addOil();
        }
        addEggs();

    }

}
