package com.algorithm.proxy;

/**
 * @author wenhe
 * @date 2020/6/29 15:08
 */
public class ProxyTest {
    public static void main(String[] args) {
        UserDaoImpl u = new UserDaoImpl();
//        JDKProxyDemo jdkProxyDemo = new JDKProxyDemo(u);
//        UserDao userDao = jdkProxyDemo.createProxy();
//        userDao.insert();
//        userDao.update();

        CglibProxyTest cglibProxyTest = new CglibProxyTest(u);
        UserDaoImpl UserDaoImpl = cglibProxyTest.createProxy();
        UserDaoImpl.insert();
        UserDaoImpl.update();
    }
}
