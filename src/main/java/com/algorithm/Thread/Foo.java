package com.algorithm.Thread;

import java.util.concurrent.CountDownLatch;

//leetcode submit region begin(Prohibit modification and deletion)
class Foo {
    private int n;
    CountDownLatch countDownLatch = new CountDownLatch(1);
    public Foo(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
