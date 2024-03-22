import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number,power;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter an number:");
        number=input.nextInt();
        System.out.print("Enter a power:");
        power=input.nextInt();
        int total=1;
        for(int i=1;i<=power;i++){
            total=total*number;

        }
        System.out.print("Cevap:"+total);

    }
}