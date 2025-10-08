import java.util.Scanner;

public class CampusLibrary {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.print("Do you bring your student ID? : ");
         String bringId = sc.next();

         System.out.print("Have you registered online? : "); 
         String registeredOnline = sc.next();

         if (bringId.equals("yes") || registeredOnline.equals("yes")){
            System.out.println("Allowed to enter");
         } else {
            System.out.println("Denied entry");
         }
    }
}
