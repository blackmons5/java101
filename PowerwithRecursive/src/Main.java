import java.util.Scanner;
public class Main {
    public static double pow(double x,double y){
        return Math.pow(x,y);

    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an base:");
        double base=input.nextDouble();
        System.out.println("Enter an exponent");
        double exp=input.nextDouble();
        System.out.println(pow(base,exp));
    }
}