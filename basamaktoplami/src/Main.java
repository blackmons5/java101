import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n;
        int k;
        int toplam =0;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number:");
        n=input.nextInt();
        while(n!=0){
            k=n%10;
            toplam=toplam+k;
            n/=10;



        }
        System.out.println("The result is :"+toplam);
    }
}