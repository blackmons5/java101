import java.util.Scanner;

public class Main {
    public static int fib(int x) {
        // f(n)=f(n-1)+f(n-2)
        if(x==1||x==2){
            return 1;
        }
        return fib(x-1)+fib(x-2);


    }

    public static void main(String[] args) {
        System.out.println(fib(45));
    }
}