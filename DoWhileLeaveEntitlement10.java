import java.util.Scanner;
public class DoWhileLeaveEntitlement10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int leaveEntitlement, numLeave;
        String confirmation;

        System.out.print("Input The Number of Leave Entitlement: ");
        leaveEntitlement = input.nextInt();
        do { 
            System.out.print("Do you want to take a leave (y/n)? ");
            confirmation = input.next();

            if(confirmation.equalsIgnoreCase("y")){
                System.out.print("How many day(s)? ");
                numLeave = input.nextInt();

                if(numLeave <= leaveEntitlement){
                    leaveEntitlement -= numLeave;
                    System.out.println("Remaining leave entitlement: "+leaveEntitlement);
                }else{
                    System.out.println("You dont have enough leave entitlement");
                    continue;
                } 
            }
        } while (leaveEntitlement > 0);
        System.out.println( "You already use all your leave entitlement");
    }
}
