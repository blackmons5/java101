import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin boyutunu girin: ");
        int boyut = scanner.nextInt();


        int[] dizi = new int[boyut];
        for (int i = 0; i < boyut; i++) {
            System.out.println("Eleman"+(i+1)+":");
            dizi[i]=scanner.nextInt();

        }
        Arrays.sort(dizi);
        System.out.println("Dizinin yeni hali:");
        for(int i=0;i<dizi.length;i++){
            System.out.println(dizi[i]+" ");
        }

    }
}
