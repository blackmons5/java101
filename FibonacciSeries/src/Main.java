import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a series value:");
        n = input.nextInt();
        int a=0;
        int b=1;
        System.out.print(a+" "+b+" ");
        for (int i = 0; i < n; i++) {
            int next=a+b;
            System.out.print(next+" ");
            a=b;
            b=next;
        }
    }
}