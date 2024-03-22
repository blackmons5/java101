import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();

        int ebob = 1;
        int ekok;

        int carpim = sayi1 * sayi2;
        int kucuk = Math.min(sayi1, sayi2);

        ekok = carpim / ebob;

        int i = 2;
        while (i <= kucuk) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
                ekok = carpim / ebob;
            }
            i++;
        }

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
}