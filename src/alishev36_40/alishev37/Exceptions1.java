package alishev36_40.alishev37;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions1 {
    public static void main(String[] args) {
        //File file = new File("test2");
        //try{
        //    Scanner scanner = new Scanner(file);
        //
        //    System.out.println("После Scanner'а");
        //} catch (FileNotFoundException e) {
        //    System.out.println("Файл не найден");
        //}
        //System.out.println("После блока try catch");
        try {
            readFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("test");
        Scanner scanner = new Scanner(file);
    }
}
