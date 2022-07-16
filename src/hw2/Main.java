package hw2;

import hw2.lib.Dao;
import hw2.lib.Injection;

import java.util.Scanner;

@Dao
@Injection

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Storage storage = new Storage();
        do {
            System.out.println("Введите значение ставки:");
            if (scanner.hasNextInt()) {
                Bet bet = new Bet();
                bet.setBetValue(Integer.parseInt(scanner.next()));
                storage.list.add(bet);
            } else {
                try {
                    if (scanner.next().equals("q")) {
                        System.out.println(storage);
                        System.exit(1);
                    } else {
                        throw new BetException("Некорректно введены данные из клавиатуры");
                    }
                } catch (BetException e) {
                    System.out.println(e.getMessage());
                    continue;
                }
            }
        }
        while (true);
    }
}
