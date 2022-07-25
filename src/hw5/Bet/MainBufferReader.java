package hw5.Bet;

import lib.Dao;
import lib.Inject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Dao
@Inject

public class MainBufferReader {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Storage storage = new Storage();
        do {
            System.out.println("Введите значение ставки:");
            Bet bet = new Bet();
            String inputStr = null;
            try {
                inputStr = reader.readLine();
                if (inputStr.equals("")) {
                    throw new BetException();
                }
            } catch (BetException | IOException e) {
                System.out.println("Вы ничего не ввели, повторите ввод.");
                continue;
            }
            if (inputStr.equals("q")) {
                System.out.println(storage);
                System.exit(1);
            }
            try {
                int betValues = Integer.parseInt(inputStr);
                bet.setBetValue(betValues);
                storage.list.add(bet);
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не целое число");
                continue;
            }


        }
        while (true);


    }
}
