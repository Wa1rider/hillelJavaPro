package hw8;

public class Main {
    public static void main(String[] args) {
        SimpleStack<Integer> stack = new SimpleStack<>(12);
        System.out.println(stack.isEmpty());
        stack.push(1);
        System.out.println(stack.isEmpty());
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop());
        System.out.println(stack.pick());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pick());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
    }
}
