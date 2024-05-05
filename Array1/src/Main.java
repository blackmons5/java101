import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int sum=0;
        int count=0;
        int[] dizi = {3, 5, 79, 12, 25,};
        for(int i=0;i<dizi.length;i++){
            sum+=dizi[i];

        }
        System.out.println(sum/dizi.length);
        System.out.println((double)1/dizi.length);
    }
}