package alishev31_35.alishev32;

public class Test {
    public static void main(String[] args) {
        //Dog dog = new Dog();
        ////Upcasting - Восходящее преобразование
        //Animal animal = dog;
        ////DownCasting - Нисходящее преобразование
        //Dog dog1 = (Dog) animal;
        //dog1.bark();
        Animal a = new Animal();
        Dog dog = (Dog) a;
        dog.bark();
    }
}
