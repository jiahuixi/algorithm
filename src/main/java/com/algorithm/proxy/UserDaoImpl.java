package com.algorithm.proxy;

/**
 * @author wenhe
 * @date 2020/6/29 15:01
 */
public class UserDaoImpl implements UserDao{
    @Override
    public void update() {
        System.out.println("update");
    }

    @Override
    public void insert() {
        System.out.println("insert");
    }
    }
