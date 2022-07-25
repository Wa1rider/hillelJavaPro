package hw5;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        System.out.println(list);
        list.add(1);
        System.out.println(list);
        list.add(2);
        System.out.println(list.toString());
        list.add(3);
        System.out.println(list);
        list.add(4);
        System.out.println(list);
        System.out.println(list.size());
        list.clear();
        System.out.println(list);
        list.add(4);
        System.out.println(list);
        list.add(3);
        System.out.println(list);
        list.add(2);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(1));
        list.remove(2);
        System.out.println(list);
        System.out.println(list.size());
        list.add(3, 2);
        System.out.println(list);
        System.out.println(list.size());
        list.add(33, 2);
        System.out.println(list);
        System.out.println(list.size());
    }
}
