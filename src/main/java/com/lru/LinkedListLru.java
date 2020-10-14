package com.lru;

import java.util.LinkedList;

/**
 * @author wenhe
 * @date 2020/7/18 10:35
 */
public class LinkedListLru<K, V> implements LRU<K, V> {

    private LinkedList<Node<K, V>> cache = null;
    private int count = 0;

    public LinkedListLru(int count) {
        this.cache = new LinkedList<Node<K, V>>();
        this.count = count;
    }

    @Override
    public void put(K key, V val) {
        int index = find( key);
        if(index!=-1){
            cache.remove(index);
        }
        Node<K, V> node = new Node<>(key,val);
        cache.add(node);
        refash();
    }

    @Override
    public V get(K key) {
        int index = find( key);
        if(index!=-1){
            Node nodeNew = cache.get(index);
            cache.remove(cache.get(index));
            cache.add(nodeNew);
            return (V) nodeNew.val;
        }else{
            return null;
        }
    }



    public int find(K key){
        for (int i = 0; i < cache.size(); i++) {
            if(cache.get(i).key == key){
                return i;
            }
        }
        return -1;
    }
    private void refash() {
        //当缓存数据比容量小的时候刷新node
        while (cache.size() > count){
            //当缓存数据等于容量的时候，删除最老的数据增加新节点
            cache.removeFirst();
        }
    }
    public static void main(String[] args) {
        LinkedListLru<Integer, Integer> lruCache = new LinkedListLru(2);
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


class Node<K, V> {
    K key;
    V val;

    public Node(K key, V val) {
        this.key = key;
        this.val = val;
    }
}