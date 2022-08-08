package alishev41_45.alishev42;

public class Test {
    public static void main(String[] args) {
        //int x = 1;
        //int y = 1;
        //System.out.println(x==y);

        //  animal1     ->      {1}
        //  animal2     ->      {1}
        //Animal animal1 = new Animal(1);
        ////Animal animal2 = new Animal(1);
        //Animal animal2 = animal1;
        //System.out.println(animal1==animal2);
        //System.out.println(animal1.equals(animal2));

        //String string1 = "Hello";
        //String string2 = "Hello";
        //String string1 = new String("Hello");
        //String string2 = new String("Hello");
        //System.out.println(string1.equals(string2));
        //System.out.println(string1 == string2);

        String a = "hello";
        String b = "hello123".substring(0, 5);
        System.out.println(b);
        System.out.println(a == b);

    }
}

class Animal {
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    public boolean equals(Object obj) {
        Animal otherAnimal = (Animal) obj;
        return this.id == otherAnimal.id;
    }
}
