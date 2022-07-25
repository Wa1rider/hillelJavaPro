package alishev21_25;

public class Lesson20 {
    public static void main(String[] args) {
        Human human1 = new Human("Bob", 21);
        human1.printNumberOfPeople();
        Human human2 = new Human("Tom", 30);
        human1.printNumberOfPeople();
        human2.printNumberOfPeople();
        Human human3 = new Human("Rob", 40);
        human3.printNumberOfPeople();
    }
}

class Human {
    private String name;
    private int age;
    private static int countPeople;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printNumberOfPeople() {
        System.out.println("Number of people is " + countPeople);
    }
}
