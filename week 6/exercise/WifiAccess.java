import java.util.Scanner;

public class WifiAccess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("input user type : ");
        String userType = sc.next();

        if (userType.equalsIgnoreCase("lecturer")){
            System.out.println("WiFi access granted (lecturer)");
            
        } else if (userType.equalsIgnoreCase("student")){
            System.out.print("How much are your credit? : ");
            int credit = sc.nextInt();

            if (credit >= 12) {
                System.out.println("WiFi access granted (active student)");
            } else if (credit <12) {
                System.out.println("Access denied, credits less than 12");
            }
        } else {
            System.out.println("Access denied");
        }

    }
}
