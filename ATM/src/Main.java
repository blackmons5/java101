import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String id,pw;
        Scanner input = new Scanner(System.in);
        int right=3;
        int balance=1500;
        int select;
        while(right>0){
            System.out.println("Kullanıcı adınız:");
            id=input.nextLine();
            System.out.println("Şifreniz:");
            pw=input.nextLine();
            if(id.equals("berke")&&pw.equals("123")){
                System.out.println("Merhaba bankamıza hoşgeldiniz.");
                do{
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.println("Yapmak istediğiniz işlemi seçiniz:");
                    select=input.nextInt();
                switch (select) {
                        case 1:
                            System.out.println("Para miktarı:"+balance);
                            int price=input.nextInt();
                            balance+=price;
                            break;
                        case 2:
                            System.out.println("Para miktarı:"+balance);
                            int withdraw=input.nextInt();
                            balance-=withdraw;
                            break;
                        case 3:
                            if(balance>0){
                                System.out.println("Para miktarı:"+balance);

                            }else{
                                System.out.println("Para kalmamıştır");
                            }

                    }

                }while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;


            }else{
                right--;
                System.out.println("Wrong id or password");


            }
            if (right==0){
                System.out.println("Hesabınız blokelidir bankanızla iletişime geçiniz");
            }else{
                System.out.println("Kalan hakkınız:"+right);
            }

        }
    }
}