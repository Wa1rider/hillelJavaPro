package alishev21_25;

public class Lesson24 {
    public static void main(String[] args) {
        Human24 h1 = new Human24("Bobb", 12);
        System.out.println(h1);
    }
}

class Human24{
    private String name;
    private int age;

    public Human24(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ", " + age ;
    }
}
