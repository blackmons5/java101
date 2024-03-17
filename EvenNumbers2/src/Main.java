import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int k;
        int cnt=0;
        int sum=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        k=input.nextInt();
        for(int i=0;i<=k;i++) {
            if (i % 3 == 0 && i%4==0) {
                cnt ++;
                sum += i;
            }
        }
        int avg=0;
        avg=sum/cnt;
        System.out.println(avg);


    }
}