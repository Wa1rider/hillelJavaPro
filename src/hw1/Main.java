package hw1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bet bet = new Bet();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение ставки:");
        if (scanner.hasNextInt()) {
            bet.setBetValue(scanner.nextInt());
        } else {
            System.out.println("Вы ввели не целое число!");
            return;
        }
        if (bet.getBetValue() > 0) {
            System.out.println(bet.toString());
        }
    }

}