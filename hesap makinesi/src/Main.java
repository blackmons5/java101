import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen 1. sayıyı giriniz:");
        a = input.nextInt();
        System.out.println("Lütfen bi operator giriniz:(+,-,/,*)");
        String str = input.next();
        char ope= str.charAt(0);
        System.out.print("Lütfen 2. sayıyı giriniz:");
        b = input.nextInt();
        int result = 0;
        switch (ope)
        {
            case '+':
                result = (a + b);
                break;
            case '-':
                result = (a - b);
                break;
            case '*':
                result = (a * b);
                break;
            case '/':
                result = (a / b);
                break;
            default:
                System.out.println("Wrong operator");

        }
        System.out.println("Result is:"+result);


    }
}