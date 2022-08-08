package alishev46_50.alishev49;

public class Test {
    public static void main(String[] args) {
        System.out.println(fact(4));
    }

    //private static void someMethod(){
    //    System.out.println("Hello");
    //    someMethod();
    //}

    //private static void counter(int n){
    //    if(n==0){
    //        return;
    //    }
    //    System.out.println(n);
    //        counter(n-1);
    //    }

    private static int fact(int n){
        if(n==1 || n==0){
            return 1;
        }
        return  n* fact(n-1);
    }
}

