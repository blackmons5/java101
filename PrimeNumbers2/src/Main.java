public class Main {

    public static void main(String[] args) {
        int i, j;

        System.out.println("1'den 100'e Kadar Asal Sayılar:");

        for (i = 2; i <= 100; i++) {
            for (j = 2; j <= i; j++) {
                if (i % j == 0) {
                    break;
                }
            }

            if (j == i) {
                System.out.print(i + " ");
            }
        }
    }
}