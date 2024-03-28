import java.util.Scanner;
public class Main {

    static boolean isAsal(int sayi, int bolen) {
        if (sayi <= 1) {
            return false;
        } else if (bolen == 1) {
            return true;
        } else if (sayi % bolen == 0) {
            return false;
        } else {
            return isAsal(sayi, bolen - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        int sayi=input.nextInt();

        if (isAsal(sayi, sayi - 1)) {
            System.out.println(sayi + " asal sayıdır.");
        } else {
            System.out.println(sayi + " asal sayı değildir.");
        }
    }
}