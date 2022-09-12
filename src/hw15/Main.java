package hw15;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String path = "G:\\JAVA\\project\\hillelJavaPro\\test.txt";
        File file = new File(path);
        String textFromFile = null;
        try {
            textFromFile = ReaderFromFile.readText(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Исходный текст: \n" + textFromFile);
        String newText = Decoder.decode(textFromFile);
        System.out.println("Декодированный  текст: \n" + newText);
        try {
            WriterToFile.writeText(file, newText);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
