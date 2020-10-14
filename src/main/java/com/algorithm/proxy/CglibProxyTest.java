package com.algorithm.proxy;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author wenhe
 * @date 2020/6/29 15:20
 */
public class CglibProxyTest implements MethodInterceptor {


    private Object target;

    public CglibProxyTest(Object target){
        this.target = target;
    }
    public UserDaoImpl createProxy(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return (UserDaoImpl)enhancer.create();

    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglibstart");
        Object os =  methodProxy.invoke(target,objects);
        System.out.println("cglibend");
        Lock lock = new ReentrantLock() ;
        ReentrantReadWriteLock lock2 = new ReentrantReadWriteLock();
        Lock lock3 = new ReentrantLock() ;
        return os;
    }
}
