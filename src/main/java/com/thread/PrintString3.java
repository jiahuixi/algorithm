package com.thread;

import java.util.concurrent.CountDownLatch;

/**
 * @author wenhe
 * @date 2020/8/5 16:42
 */
//我们提供了一个类：
//
//
//public class Foo {
//  public void one() { print("one"); }
//  public void two() { print("two"); }
//  public void three() { print("three"); }
//}
//
//
// 三个不同的线程将会共用一个 Foo 实例。
//
//
// 线程 A 将会调用 one() 方法
// 线程 B 将会调用 two() 方法
// 线程 C 将会调用 three() 方法
//
//
// 请设计修改程序，以确保 two() 方法在 one() 方法之后被执行，three() 方法在 two() 方法之后被执行。
//
//
//
// 示例 1:
//
//
//输入: [1,2,3]
//输出: "onetwothree"
//解释:
//有三个线程会被异步启动。
//输入 [1,2,3] 表示线程 A 将会调用 one() 方法，线程 B 将会调用 two() 方法，线程 C 将会调用 three() 方法。
//正确的输出是 "onetwothree"。
//
//
// 示例 2:
//
//
//输入: [1,3,2]
//输出: "onetwothree"
//解释:
//输入 [1,3,2] 表示线程 A 将会调用 one() 方法，线程 B 将会调用 three() 方法，线程 C 将会调用 two() 方法。
//正确的输出是 "onetwothree"。
//
//
//
// 注意:
//
// 尽管输入中的数字似乎暗示了顺序，但是我们并不保证线程在操作系统中的调度顺序。
//
// 你看到的输入格式主要是为了确保测试的全面性。
// 👍 159 👎 0

public class PrintString3 {
    static CountDownLatch countDownLatch1 = new CountDownLatch(1);
    static CountDownLatch countDownLatch2= new CountDownLatch(1);
    static CountDownLatch countDownLatch3 = new CountDownLatch(1);
    static volatile int a = 1;

    public static void printOne(int n) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            if (a != 1) {
                countDownLatch1.await();
            }
            System.out.println("打印one");
            a = 2;

            countDownLatch2.countDown();

            countDownLatch2= new CountDownLatch(1);

        }
    }

    public static void printTwo(int n) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            if (a != 2) {
                countDownLatch2.await();
            }
            System.out.println("打印two");
            a = 3;

            countDownLatch3.countDown();
            countDownLatch3= new CountDownLatch(1);



        }
    }
    public static void printThree(int n) throws InterruptedException {
        for (int i = 0; i < n; i++) {

            if (a != 3) {
                countDownLatch3.await();
            }
            System.out.println("打印three");
            a = 1;
            countDownLatch1.countDown();
            countDownLatch1= new CountDownLatch(1);

        }
    }

    public static void main(String[] args) {
        final int a = 3;
        new Thread(() -> {
            try {
                printOne(a);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                printTwo(a);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                printThree(a);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}