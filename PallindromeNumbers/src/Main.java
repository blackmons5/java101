import java.util.Scanner;

public class Main {
    public static int pal(int number) {
        int originalNumber = number;
        int reverseNumber = 0;

        while (number != 0) {
            int lastNumber = number % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            number /= 10;
        }

        if (originalNumber == reverseNumber) {
            System.out.println("Yes, it's a palindrome number");
            return number;
        } else {
            System.out.println("No, it's not a palindrome number");
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();

        int result = pal(number);
        if(result != -1){
            System.out.println(result + " is palindrome");
        }else{
            System.out.println(number + " is not palindrome");
        }
    }
}