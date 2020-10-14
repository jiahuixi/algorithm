package com.lru;


import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author wenhe
 * @date 2020/7/18 10:03
 */

public class MyLru<K,V> implements LRU<K,V>{

    private LinkedHashMap<K,V> cache = null;
    @Override
    public void put(K key, V val) {
        cache.put(key,val);
    }
    @Override
    public V get(Object key) {
        return cache.get(key);
    }
    public MyLru(int size) {
        this.cache = new LinkedHashMap<K,V>(size+1,1,true){
            @Override
            protected boolean removeEldestEntry(Map.Entry<K,V> eldest){
               return size()>size;
            }
        };
     }



    public static void main(String[] args) {
        MyLru<Integer, Integer> lruCache = new MyLru<>(2);
        lruCache.put(1, 1);
        lruCache.put(2, 2);
        System.out.println(lruCache.get(1));
        lruCache.put(3, 3);
        System.out.println(lruCache.get(2));
        lruCache.put(4, 4);
        System.out.println(lruCache.get(1));
        System.out.println(lruCache.get(3));
        System.out.println(lruCache.get(4));


    }
}
