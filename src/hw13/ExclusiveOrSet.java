package hw13;

import java.util.HashSet;
import java.util.Set;

public class ExclusiveOrSet {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> intersect = new HashSet<>();
        Set<Integer> union = new HashSet<>();
        Set<Integer> subtract = new HashSet<>();
        Set<Integer> exclusiveOr = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        System.out.println("Множество А: \n" + set1);
        System.out.println("Множество B: \n" + set2);
        intersect.addAll(set1);
        intersect.retainAll(set2);
        System.out.println("Пересечение множеств: \n" + intersect);
        union.addAll(set1);
        union.addAll(set2);
        System.out.println("Объединение множеств: \n" + union);
        subtract.addAll(set1);
        subtract.removeAll(set2);
        System.out.println("Разность множеств: \n" + subtract);
        exclusiveOr.addAll(set2);
        exclusiveOr.removeAll(set1);
        exclusiveOr.addAll(subtract);
        System.out.println("Симетрическая разность множеств: \n" + exclusiveOr);
    }
}
