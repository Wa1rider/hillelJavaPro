package hw13;

public class MultiplicationTableCase3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i < 10; i++) {
            for (int j = 2; j < 6; j++) {
                sb.append(j + " * " + i + " = " + j * i + "\t" + "\t");
            }
            sb.append("\n");
        }
        sb.append("\n");
        for (int i = 2; i < 10; i++) {
            for (int j = 6; j < 10; j++) {
                sb.append(j + " * " + i + " = " + j * i + "\t" + "\t");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
