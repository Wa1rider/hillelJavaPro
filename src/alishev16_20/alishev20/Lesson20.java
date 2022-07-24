package alishev16_20.alishev20;

public class Lesson20 {
    public static void main(String[] args) {
    Human human1 = new Human();
    Human human2 = new Human("Bob");
    Human human3 = new Human("Bob", 21);
    }
}

class Human {
    private String name;
    private int age;

    public Human() {
        this.name = "Имя поумолчанию";
        this.age = 0;
    }

    public Human(String name) {
        System.out.println("Привет из второго конструктора");
        this.name = name;
    }

    public Human(String name, int age) {
        System.out.println("Привет из третьего конструктора");
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
