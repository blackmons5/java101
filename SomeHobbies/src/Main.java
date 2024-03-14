import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);
        System.out.print("Please give the heat:");
        heat=input.nextInt();

        if(heat<5){
            System.out.print("Go do some winter ski");
        }
        if(heat>5 && heat<15){
            System.out.print("U should watch dune part 2");
        }
        if(heat>15 && heat<25){
            System.out.print("Go touch same grass");
        }
        if (heat >25){
            System.out.print("GO THE AQUAPARKKKKKKKKKKKKKKKK");
        }

    }
}