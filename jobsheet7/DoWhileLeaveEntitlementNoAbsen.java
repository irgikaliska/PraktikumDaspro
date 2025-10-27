package jobsheet7;
import java.util.Scanner;

public class DoWhileLeaveEntitlementNoAbsen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int leaveEntitlement, numLeave;
        String confirmation;

        System.out.print("Input the number of leave entitlement: ");
        leaveEntitlement = input.nextInt();
        input.nextLine(); 

        do { 
            
            System.out.print("Do you want to take a leave? (y/n)? ");
            confirmation = input.next();

            if (confirmation.equalsIgnoreCase("y")) {
                System.out.print("How many day(s)? ");
                numLeave = input.nextInt();

                if (numLeave <= leaveEntitlement) {
                    leaveEntitlement -= numLeave;
                    System.out.println("Remaining leave entitlement: " + leaveEntitlement);
                } else {
                    System.out.println("You don't have enough leave entitlement.");
                    break;
                }
            }else if (confirmation.equalsIgnoreCase("t")) {
                break;
            }
        } while (leaveEntitlement > 0);


    }
}