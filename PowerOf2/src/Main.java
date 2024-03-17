import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        n=input.nextInt();
        for (int i = 1; i <= n; i *= 2) {
            System.out.println("power of 2's is:" + i);
        }
    }
}