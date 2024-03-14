import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String month;
        int day;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter month:");
        month=input.nextLine();
        System.out.print("Enter a day:");
        day=input.nextInt();
        if(month.equals("January")){
            if(day>=1 && day<=31) {
                if(day<22){
                    System.out.println("Capricorn");
                }else{
                    System.out.println("Aquarius");
                }


            }
        }
        else if (month.equals("February")){
            if(day>=1 && day<=29){
                if(day<20){
                    System.out.println("Aquarius");
                }else{
                    System.out.println("Pisces");
                }
            }
        }
        else if (month.equals("March")){
            if(day>=1 && day<=31){
                if(day<21){
                    System.out.println("Pisces");
                }else{
                    System.out.println("Aries");
                }
            }
        }
        else if(month.equals("April")){
            if(day<21){
                System.out.println("Aries");
            }else{
                System.out.println("Taurus");
            }
        }
        else if(month.equals("May")){
            if(day<22){
                System.out.println("Taurus");
            }
            else if(day<=31){
                System.out.println("Gemini");
            }
        }

    }
}