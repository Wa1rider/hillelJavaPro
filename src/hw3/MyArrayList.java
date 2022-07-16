package hw3;

import java.util.Arrays;

interface ArrayListInt<T> {
    void add(T obj);

    int size();

    void remove(int index);

    T get(int index);

    void clear();
}

public class MyArrayList<T> implements ArrayListInt<T> {
    private int size = 0;
    private T[] mass = (T[]) new Object[0];

    @Override
    public void add(T obj) {
        size++;
        mass = Arrays.copyOf(mass, size);
        mass[size - 1] = obj;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void remove(int index) {
        size--;
        T[] temp = (T[]) new Object[size];
        System.arraycopy(mass, 0, temp, 0, index);
        System.arraycopy(mass, index + 1, temp, index, mass.length - index - 1);
        mass = temp;
    }

    @Override
    public T get(int index) {
        return mass[index];
    }

    @Override
    public void clear() {
        size = 0;
        mass = (T[]) new Object[0];
    }

    @Override
    public String toString() {
        return Arrays.toString(mass);
    }
}

class Main {
    public static void main(String[] args) {
        MyArrayList<String> arr = new MyArrayList<>();
        arr.add("1");
        arr.add("2");
        arr.add("3");
        arr.add("4");
        arr.add("5");
        System.out.println("Массив: " + arr);
        System.out.println("Размер массива: " + arr.size());
        arr.remove(2);
        System.out.println("Массив: " + arr);
        System.out.println("Размер массива: " + arr.size());
        System.out.println("Элемент на первой позиции: " + arr.get(1));
        arr.clear();
        System.out.println("Массив: " + arr);
        System.out.println("Размер массива: " + arr.size());
    }
}
