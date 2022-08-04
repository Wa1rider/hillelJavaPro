package hw7;

import java.util.Arrays;

public class MyQueue<E> {
    private int size;
    private int front;
    private int tail;
    private E[] queueArray;

    public MyQueue() {
        this.queueArray = (E[]) new Object[0];
        this.front = 0;
        this.tail = 0;
        this.size = 0;
    }

    public boolean add(E obj) {
        size++;
        queueArray = Arrays.copyOf(queueArray, size);
        queueArray[size - 1] = obj;
        if (size > 1){
            tail++;
        }
        return true;
    }

    public boolean remove() {
        if (queueArray.length == 0) {
            return false;
        } else {
            size--;
            E[] arr = (E[]) new Object[size];
            System.arraycopy(queueArray, 1, arr, 0, queueArray.length - 1);
            queueArray = arr;
            tail--;
        }
        return true;
    }

    public int size() {
        return size;
    }

    public void clear() {
        size = 0;
        queueArray = (E[]) new Object[0];
    }

    public E get(int index) {
        return queueArray[index - 1];
    }

    @Override
    public String toString() {
        return "{" + Arrays.toString(queueArray) + '}';
    }
}
