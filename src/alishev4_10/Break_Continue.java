package alishev4_10;

public class Break_Continue {
    public static void main(String[] args) {
        for (int i = 0; i <= 15; i++){
            if(i%2==0){
                continue;
            }
            System.out.println("Это нечётное число " + i);
        }
    }
}
