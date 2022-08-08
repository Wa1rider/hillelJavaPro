package alishev36_40.alishev38;

import java.util.Scanner;

public class Exceptions2 {
    public static void main(String[] args) throws ScannerException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int x = Integer.parseInt(scanner.nextLine());
            //if(x!=0){
            //    try {
            //        throw new IOException();
            //    } catch (IOException e){
            //        System.out.println("Пользователь ввёл что-то кроме нуля");
            //    }
            //}
            if (x != 0) {
                throw new ScannerException("Пользователь ввёл что-то кроме нуля");
            }
        }
    }
}
