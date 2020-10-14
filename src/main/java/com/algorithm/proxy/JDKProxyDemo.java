package com.algorithm.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author wenhe
 * @date 2020/6/29 15:05
 */
public class JDKProxyDemo implements InvocationHandler {

    private Object  target;

    public JDKProxyDemo(Object target){
        this.target = target;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("方法开始之前");
        Object o = method.invoke(target,args);
        System.out.println("方法开始之后");
        return o;
    }
    public UserDao createProxy(){

        return (UserDao) Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
}
