import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dizi tanımlama
        int[] dizi = {15, 12, 788, 1, -1, -778, 2, 0};

        // Kullanıcıdan giriş al
        System.out.print("Bir sayı girin: ");
        int girilenSayi = scanner.nextInt();

        int enBuyukEnYakin = Integer.MAX_VALUE;
        int enKucukEnYakin = Integer.MIN_VALUE;

        for (int num : dizi) {
            if (num < girilenSayi && num > enKucukEnYakin) {
                enKucukEnYakin = num;
            }
            if (num > girilenSayi && num < enBuyukEnYakin) {
                enBuyukEnYakin = num;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı: " + enKucukEnYakin);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + enBuyukEnYakin);

    }
}