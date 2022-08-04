package alishev31_35.alishev34;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());

        test(listOfAnimal);
        test(listOfDogs);
    }

    private static void test(List<? extends Animal> list) {
        for (Animal animal : list) {
            System.out.println(animal);
        }
    }

    //private static void test(List<? super Animal> list) {
    //    for (Animal animal : list) {
    //        animal.eat();
    //    }
    //}
}
