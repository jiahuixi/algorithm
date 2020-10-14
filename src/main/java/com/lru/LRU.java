package com.lru;

/**
 * @author wenhe
 * @date 2020/7/18 10:34
 */
public interface LRU<K, V> {

    void put(K key, V val);

    V get(K key);

}