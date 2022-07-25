package hw5;

public interface MyLinkedListInt <T>{
    void add(T obj);
    void add(T obj, int index);
    void clear();
    void remove(int index);
    T get(int index);
    int size();
}
