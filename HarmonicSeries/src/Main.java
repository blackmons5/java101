import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number;");
        n=input.nextInt();
        double result=0.0;
        for(double i=1;i<=n;i++){
            result+=(1.0/i);
            System.out.println(1/i);

        }
        System.out.println("The harmonic series is:"+result);
    }
}