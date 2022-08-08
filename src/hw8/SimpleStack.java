package hw8;

public class SimpleStack<E> {
    private E[] stackArr;
    private int maxSize;
    private int top;

    public SimpleStack(int maxSize) {
        this.stackArr = (E[]) new Object[maxSize];
        this.maxSize = maxSize;
        this.top = -1;
    }

    public void push(E element) {
        stackArr[++top] = element;
    }

    public E pop() {
        if (top == -1){
            return null;
        }
        return stackArr[top--];
    }

    public E pick() {
        if (top == -1){
            return null;
        }
        return stackArr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
