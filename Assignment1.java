
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input some number: ");
        int numInput = sc.nextInt();
        int s = numInput;
        int printedStars = 0;

        for (int i = 0; i< 15; i++){
            System.out.print("* ");
            printedStars++;

            if(printedStars == s){
                System.out.println();
                s--;
                printedStars = 0;
            }
        }
    }
}