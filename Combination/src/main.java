import java.util.Scanner;

public
class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan n ve r değerlerini alalım
        System.out.print("N değerini giriniz: ");
        int n = scanner.nextInt();
        System.out.print("R değerini giriniz: ");
        int r = scanner.nextInt();

        // n ve r'nin geçerliliğini kontrol edelim
        if (n < r) {
            System.out.println("Hata: n değeri r değerinden büyük olmalıdır!");
            return;
        }

        // Kombinasyonu hesaplayalım
        int kombinasyon = 1;
        for (int i = 1; i <= r; i++) {
            kombinasyon *= (n - i + 1) / i;
        }

        // Sonucu ekrana yazdıralım
        System.out.println(n + " elemanlı bir kümeden " + r + " elemanlı kombinasyonların sayısı: " + kombinasyon);
    }
}