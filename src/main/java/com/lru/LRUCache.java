package com.lru;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author wenhe
 * @date 2020/9/2 16:16
 */
public class LRUCache {
    private int capacity;

    Map<Integer, Integer> cache = new HashMap<>();
    LinkedList<String> keyList = new LinkedList<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if (keyList.contains(String.valueOf(key))) {
            keyList.remove(String.valueOf(key));
            keyList.add(String.valueOf(key));
            return cache.get(key);
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        keyList.remove(String.valueOf(key));
        keyList.add(String.valueOf(key));
        cache.put(key, value);
        while(keyList.size()>capacity){
            cache.remove(Integer.valueOf(keyList.remove(0))) ;
        }
    }
    public static void main(String[] args) {
         LRUCache lruCache = new LRUCache(2);
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
