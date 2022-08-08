package alishev36_40.alishev39;

public class Exceptions3 {
    public static void main(String[] args) {
        //Checked Exception(Compile time exception) = исключительные случаи в работе программы
        //Unchecked (Runtime exception) = ошибка в работе программы

        //File file = new File("test2");
        //try{
        //    Scanner scanner = new Scanner(file);
        //} catch (FileNotFoundException e) {
        //    System.out.println("Файл не найден");
        //}

        //int a = 1 / 0;

        //String name = null;
        //name.length();

        try {
            int[] arr = new int[2];
            System.out.println(arr[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Такого элемента нет в массиве");
        }
    }
}
