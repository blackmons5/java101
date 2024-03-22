import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to build reverse triangle:");
        n=input.nextInt();
        for(int i=n;i>=1;i--){
            for(int k=1;k<=(2*i)-1;k++){
                System.out.print("*");
            }
            System.out.println();

        }


    }
}