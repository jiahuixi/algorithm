package com.design.Strategy;

/**
 * @author wenhe
 * @date 2020/8/9 13:15
 */
public class Operator {
    private Jisuan jisuan;
    public Operator(Jisuan jisuan){
        this.jisuan=jisuan;
    }
    public int getJIeguo(int a,int b ){
        return jisuan.getJieguo(a,b);

    }
}
