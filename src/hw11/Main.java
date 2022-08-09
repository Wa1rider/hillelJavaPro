package hw11;

public class Main {
    public static void main(String[] args) {
        MyHashMap<Integer, String> map = new MyHashMap<>();
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        map.put(null, "11");
        map.put(null, "12");
        map.put(1, "11");
        System.out.println(map);
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        map.clear();
        System.out.println(map.isEmpty());
        System.out.println(map.size());

        map.put(1, "1");
        map.put(2, "1");
        map.put(2, "2");
        map.put(18, "3");
        map.put(3, "5");
        map.put(34, "4");
        map.put(4, "6");
        map.put(5, "7");
        map.put(6, "8");
        map.put(7, "9");
        map.put(8, "10");
        map.put(9, "11");
        map.put(10, "12");
        System.out.println("Map'a до перераспределения: \n" + map);
        System.out.println(map.size());
        map.put(11, "13");
        System.out.println("Map'a после перераспределения: \n" + map);
        System.out.println(map.size());

        System.out.println(map.get(34));
        System.out.println(map.get(18));
        map.remove(2);
        System.out.println("Map'a после удаления: \n" + map);
        System.out.println(map.size());
    }
}
