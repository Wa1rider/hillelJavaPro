import java.util.Scanner;

public class EnteringNumbersHandler {
    public static String getString() {
        String string = "";
        do {
            System.out.println("Введите пример для вычисления" +
                    "(для выхода введите команду \'exit\')");
            Scanner scanner = new Scanner(System.in);
            string = scanner.nextLine();
        } while (string.equals("") || string == null);
        return string;
    }
}
