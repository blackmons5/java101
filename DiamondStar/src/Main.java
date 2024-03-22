import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Elmasın yüksekliğini giriniz
        System.out.print("Elmasın yüksekliğini giriniz: ");
        int yukseklik = scanner.nextInt();

        // Yukarı doğru üçgen oluşturma
        for (int i = 1; i <= yukseklik; i++) {
            // Boşluk karakterleri yazdırma
            for (int j = 1; j <= yukseklik - i; j++) {
                System.out.print(" ");
            }

            // Yıldız karakterleri yazdırma
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Satır sonuna geçme
            System.out.println();
        }

        // Aşağı doğru üçgen oluşturma
        for (int i = yukseklik - 1; i >= 1; i--) {
            // Boşluk karakterleri yazdırma
            for (int j = 1; j <= yukseklik - i; j++) {
                System.out.print(" ");
            }

            // Yıldız karakterleri yazdırma
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Satır sonuna geçme
            System.out.println();
        }
    }
}