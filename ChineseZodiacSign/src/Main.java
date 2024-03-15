import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int year;
        int sign;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your birth year:");
        year=input.nextInt();
        sign=year%12;
        switch(sign) {
            case 0:
                System.out.println("Ape");
                break;
            case 1:
                System.out.println("Cockerel");
                break;
            case 2:
                System.out.println("Dog");
                break;
            case 3:
                System.out.println("Pig");
                break;
            case 4:
                System.out.println("Rat");
                break;
            case 5:
                System.out.println("Cow");
                break;
            case 6:
                System.out.println("Tiger");
                break;
            case 7:
                System.out.println("Rabbit");
                break;
            case 8:
                System.out.println("Dragon");
                break;
            case 9:
                System.out.println("Snake");
                break;
            case 10:
                System.out.println("Horse");
                break;
            case 11:
                System.out.println("Sheep");
                break;
            default:
                System.out.println("Wrong year");

        }
    }
}