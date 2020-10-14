package com.thread.blockqueue;

import java.util.List;

/**
 * @author wenhe
 * @date 2020/9/25 20:24
 */
public class BlockQueue {

    List<Integer> queue ;
    volatile int count;
    public BlockQueue(List<Integer> queue,int count){
        this.queue = queue;
        this.count =count;
    }
    private synchronized int getSize(){
        return queue.size();
    }
    public void push(int value){
        while(getSize() >= count){

        }
        if(queue.size() < count){
            queue.add(value);
            count++;
        }
    }
    public int poll(){
        while(getSize()==0){

        }
        count--;
        return queue.remove(0);
    }
}
