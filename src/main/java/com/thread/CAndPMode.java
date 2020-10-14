package com.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @author wenhe
 * @date 2020/8/6 13:58
 */
public class CAndPMode {
    public static void main(String[] args) {
        BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<Integer>(10);
        Queue queuee = new Queue(blockingQueue);
        Product product = new Product(queuee);
        Custom custom = new Custom(queuee);
        new Thread(product).start();
        new Thread(custom).start();
    }




}

class Queue {
    private BlockingQueue<Integer> blockingQueue ;
    public Queue(BlockingQueue blockingQueue) {
        this.blockingQueue = blockingQueue;
    }
    public void prod(int source){
       System.out.println( source);
        System.out.println(  blockingQueue.offer(source));
    }
    public int cus(){
        System.out.println("开始消费");
        return blockingQueue.poll();
    }
    public int size(){
        return blockingQueue.size();
    }
}
class Product implements  Runnable{
    private Queue queue;
    public Product(Queue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
      for(int i = 0 ;;i++){
            try {
                TimeUnit.SECONDS.sleep(1);
                queue.prod(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
class Custom implements  Runnable{
    private Queue queue;
    public Custom(Queue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true){
            try {
//                TimeUnit.SECONDS.sleep(1);
                if(queue.size()>0){
                    queue.cus();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}