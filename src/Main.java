import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        do {
            String expression = EnteringNumbersHandler.getString();
            if (expression.equals("exit")) {
                System.out.println("Вы вишли из калькулятора!");
                System.exit(1);
            }
            String answer = CalculatorLogic.mainLogic(expression);
            System.out.println("Ответ: " + answer);
            File file = new File("G:\\JAVA\\project\\javaPro\\calculatorHistory");
            try {
                WriterToFile.writeInfo(file, expression + " = " + answer);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        while (true);
    }
}
