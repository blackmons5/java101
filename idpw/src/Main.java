import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String id, pw;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen id'nizi girin:");
        id = input.nextLine();
        System.out.print("Lütfen pw'nizi girin:");
        pw = input.nextLine();
        if (id.equals("zort123") && pw.equals("zort1234")) {
            System.out.println("Başarıyla giriş yaptınız.");
        } else {
            System.out.println("Id veya şifre yanlış.");
            System.out.println("Şifre sıfırlamak ister misiniz?(Evet,Hayır)");
            String cevap = input.nextLine();
            if (cevap.equals("Evet")) {
                System.out.println("Yeni şifrenizi giriniz:");
                String yenisifre = input.nextLine();
                if (!yenisifre.equals(pw)) {
                    System.out.println("Yeni şifreniz başarıyla oluşturuldu");
                } else {
                    System.out.println("Yeni şifreniz eskisiyle aynı olamaz.");
                }
            } else {
                System.out.println("Şifre sıfırlama işlemi iptal edildi.");
            }
        }
    }
}