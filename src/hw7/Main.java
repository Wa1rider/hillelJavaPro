package hw7;

public class Main {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        System.out.println(queue.size());
        queue.clear();
        System.out.println(queue);
        System.out.println(queue.size());

        System.out.println("Новая очередь:");

        MyQueue<String> queue2 = new MyQueue<>();
        queue2.add("Первый в очереди");
        queue2.add("Второй в очереди");
        queue2.add("Третий в очереди");
        System.out.println(queue2);
        System.out.println(queue2.size());
        System.out.println(queue2.get(3));
        queue2.remove();
        System.out.println(queue2);
        System.out.println(queue2.size());
        queue2.remove();
        System.out.println(queue2);
        System.out.println(queue2.size());
    }
}
