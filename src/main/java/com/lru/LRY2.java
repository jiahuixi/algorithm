package com.lru;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * @author wenhe
 * @date 2020/7/19 11:20
 */
public class LRY2<K,V> implements LRU<K,V>{


    private int cap;
    private LinkedList<K> cache = new LinkedList<K>();
    private HashMap<K,Node<K,V>> map = new HashMap<>();

    public LRY2(int cap) {
        this.cap = cap;
    }

    @Override
    public void put(K key, V val) {
        //找到是否存在这个节点
        Node node = map.get(key);
        if(node == null){
            Node nodec = new Node(key,val);
            cache.add(key);
            map.put(key,nodec);
            refash();
        }else{
            //存在节点就删除这个key并重新put进去
            cache.remove(key);
            cache.add(key);
            map.put(key,node);
        }
    }
    @Override
    public V get(K key) {
        Node node = map.get(key);
        if(node == null){
            return null;
        }else{
            cache.remove(key);
            cache.add(key);
            return (V) node.val;
        }
    }
     private void refash (){
        while(cache.size()>cap){
            K key = cache.removeFirst();
            map.remove(key);
        }
     }
    public static void main(String[] args) {
        LRY2<Integer, Integer> lruCache = new LRY2(2);
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
