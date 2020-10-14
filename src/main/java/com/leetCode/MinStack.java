package com.leetCode;

import java.util.LinkedList;

/**
 * @author wenhe
 * @date 2020/9/3 16:16
 */
public class MinStack {
    /** initialize your data structure here. */
    private LinkedList<Integer> stack = new LinkedList<>();
    private LinkedList<Integer> minStack = new LinkedList<>();
    public MinStack() {
        this.stack = stack;
        this.minStack = minStack;
    }

    public void push(int x) {
        stack.push(x);
        if(minStack.isEmpty()||minStack.peek()>x){
            minStack.push(x);
        }else{
            minStack.push(minStack.peek());
        }
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
