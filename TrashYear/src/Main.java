import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your birth year:");
        year=input.nextInt();
        if(year%4==0){
            System.out.println( year +  "is a trash year");
        }else{
            System.out.println( year + "is not a trash year");
        }
    }
}