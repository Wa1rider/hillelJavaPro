package hw11;

import java.util.Objects;

public class MyHashMap<K, V> {
    private final double LOAD_FACTOR = 0.75;
    private Node[] arrNode;
    private int size;

    public MyHashMap() {
        this.arrNode = new Node[16];
        this.size = 0;
    }

    static class Node<K, V> {
        K key;
        V value;
        Node<K, V> nextNode;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
            this.nextNode = null;
        }

        @Override
        public String toString() {
            return key + " : " + value;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        size = 0;
        arrNode = new Node[16];
    }

    public void put(K key, V value) {
        if (size >= (int) arrNode.length * LOAD_FACTOR) {
            grow();
        }
        int putIndex = getIndexFromHash(key);
        Node<K, V> currNode = arrNode[putIndex];
        while (currNode != null) {
            if (Objects.equals(currNode.key, key)) {
                arrNode[putIndex] = new Node(key, value);
                return;
            } else {
                if (currNode.nextNode == null) {
                    currNode.nextNode = new Node(key, value);
                    size++;
                    return;
                }
                currNode = currNode.nextNode;
            }
        }
        arrNode[putIndex] = new Node(key, value);
        size++;
    }

    private void grow() {
        int Capacity = arrNode.length << 1;
        Node<K, V>[] tempArrNode = arrNode;
        int tempSize = size;
        arrNode = new Node[Capacity];
        for (Node<K, V> node : tempArrNode) {
            if (node != null) {
                put(node.key, node.value);
                Node<K, V> tempNode = node.nextNode;
                while (tempNode != null) {
                    put(tempNode.key, tempNode.value);
                    tempNode = tempNode.nextNode;
                }
            }
        }
        size = tempSize;
    }

    private int getIndexFromHash(K key) {
        if (key == null) {
            return 0;
        } else {
            return key.hashCode() % arrNode.length;
        }
    }

    public V get(K key) {
        int getIndex = getIndexFromHash(key);
        Node<K, V> tempNode = arrNode[getIndex];
        while (tempNode != null) {
            if (Objects.equals(tempNode.key, key)) {
                return tempNode.value;
            }
            tempNode = tempNode.nextNode;
        }
        return null;
    }

    public void remove(K key) {
        int getIndex = getIndexFromHash(key);
        Node<K, V> tempNode = arrNode[getIndex];
        Node<K, V> prevNode = tempNode;
        while (tempNode != null) {
            if (Objects.equals(tempNode.key, key)) {
                if (tempNode.nextNode == null) {
                    prevNode.nextNode = null;
                    tempNode = null;
                    size--;
                    continue;
                }
                if (tempNode == arrNode[getIndex]) {
                    tempNode = tempNode.nextNode;
                    arrNode[getIndex] = tempNode;
                }
                prevNode.nextNode = tempNode.nextNode;
                size--;

            } else {
                prevNode = tempNode;
            }
            tempNode = tempNode.nextNode;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Node<K, V> node : arrNode) {
            if (node != null) {
                sb.append(node);
                sb.append("\n");
                while (node.nextNode != null) {
                    sb.append(node.nextNode);
                    sb.append("\n");
                    node = node.nextNode;
                }
            }
        }
        return sb.toString();
    }
}
