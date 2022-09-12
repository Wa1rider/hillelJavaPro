package hw15;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReaderFromFile {
    public static String readText(File file) throws IOException {
        StringBuilder textFromFile = new StringBuilder();
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            textFromFile.append(scanner.nextLine() + "\n");
        }
        return textFromFile.toString();
    }
}
