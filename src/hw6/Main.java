package hw6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Collection<Car> list = new ArrayList<>();
        Car car1 = new Car("Audi", 190);
        Car car2 = new Car("Peugeot", 120);
        Car car3 = new Car("BMW", 200);
        Car car4 = new Car("Nissan", 140);
        Car car5 = new Car("Renault", 150);
        Car car6 = new Car("Mazda", 160);
        Car car7 = new Car("Volvo", 170);
        Car car8 = new Car("Porsche", 180);
        Car car9 = new Car("Volga", 110);
        Car car10 = new Car("Opel", 130);
        list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(car4);
        list.add(car5);
        list.add(car6);
        list.add(car7);
        list.add(car8);
        list.add(car9);
        list.add(car10);
        Iterator<Car> iterator = list.iterator();
        System.out.println("Выводим коллекцию используя Iterator:");
        while (iterator.hasNext()) {
            Car nextCar = iterator.next();
            System.out.println(nextCar);
        }
        Car[] cars = list.toArray(new Car[0]);
        System.out.println("Преобразовали коллекцию в массив и вывели:");
        System.out.println(Arrays.toString(cars));
        Arrays.sort(cars);
        System.out.println("Отсортировали массив по скорости используя Comparable:");
        System.out.println(Arrays.toString(cars));
        Arrays.sort(cars, new MyComparator());
        System.out.println("Отсортировали массив по бренду используя Comparator:");
        System.out.println(Arrays.toString(cars));
    }
}

