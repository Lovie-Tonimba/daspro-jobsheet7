import java.util.Scanner;
public class TheTriangle10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numInput;
        int i = 0;
        String s = "";
        
        System.out.print("Input some number: ");
        numInput = input.nextInt();
        while (i < numInput) {
            s += " *";
            System.out.println(s);
            i++;
        }

        //MODIFICATION NO.1
        // for(int i = 0; i < numInput; i++){
        //     s += " *";
        //     System.out.println(s);
        // }
    }
}