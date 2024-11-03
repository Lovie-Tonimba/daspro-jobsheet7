import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double ticket = 50000, totalSold = 0, revenueToday = 0;
        int amountTickets = 0, totalTickets = 0;
        String confirmation;
       
        do { 
            System.out.print("Do you want to buy ticket? (yes/no) : ");
            confirmation = sc.nextLine();

            if(confirmation.equalsIgnoreCase("yes")){
                System.out.print("How many ticket you want to buy?: ");
                amountTickets = sc.nextInt();

                sc.nextLine();

                totalSold = ticket * amountTickets;
                if(amountTickets > 10){
                    totalSold = (ticket * amountTickets) - (ticket * amountTickets * 0.15);
                }else if(amountTickets > 4){
                    totalSold = (ticket * amountTickets) - (ticket * amountTickets * 0.10);
                }else if(amountTickets == 0){
                    break;
                }else if(amountTickets < 0){
                    System.out.println("Please input the number of tickets correctly");
                    continue;
                }

                totalTickets += amountTickets;
                revenueToday += totalSold;
            } else if (confirmation.equalsIgnoreCase("no")){
                break;
            }
        } while (true);

        System.out.println("Total tickets that have been sold today: " + totalTickets);
        System.out.println("Total revenue today                    : " + revenueToday);
    }
}