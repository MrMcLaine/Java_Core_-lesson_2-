package lesson18;

import java.util.*;

public class CustomMap<K, V> {
    private final List<MyEntry<K, V>> map;

    public CustomMap(List<MyEntry<K, V>> map) {
        this.map = map;
    }

    public void add(K key, V value) {
        map.add(new MyEntry<>(key, value));
    }

    public void deleteByKey(K key) {
        map.removeIf(entry -> entry.getKey().equals(key));
    }

    public void deleteByValue(V value) {
        map.removeIf(entry -> entry.getValue().equals(value));
    }

    public void printSetKeys() {
        List<K> keyList = map.stream()
                .map(MyEntry::getKey)
                .toList();
        for (K key : keyList) {
            System.out.println(key);
        }
    }

    public void printMap() {
        for (MyEntry<K, V> entry : map) {
            System.out.print("The key is ");
            System.out.println(entry.getKey());
            System.out.print("The value is ");
            System.out.println(entry.getValue());
        }
        System.out.println();
    }
}
