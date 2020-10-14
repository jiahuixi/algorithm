package com.thread;

/**
 * @author wenhe
 * @date 2020/8/6 14:42
 */
public class DeathLock {
    public static void main(String[] args) {
        String locka = "locka";
        String lockB = "lockB";
        new Thread(new Demo(locka,lockB)).start();
        new Thread(new Demo(lockB,locka)).start();
    }

}
class Demo implements Runnable{
    private String source1;
    private String source2;

    public Demo(String source1, String source2) {
        this.source1 = source1;
        this.source2 = source2;
    }

    @Override
    public void run() {
        synchronized(source1){
            System.out.println("我有资源"+source1+"我想要source2");
            synchronized (source2){
                System.out.println("我获得了资源2"+source2);
            }
        }
    }
}
