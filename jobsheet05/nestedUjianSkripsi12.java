package jobsheet05;

import java.util.Scanner;

public class nestedUjianSkripsi12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String message;
        System.out.print("Has the student been cleared of compensation? (Yes/No): ");
        String compensationStatus = sc.nextLine().trim();
        System.out.print("Enter the number of guidance logs with Supervisor 1: ");
        int supervisor1 = sc.nextInt();
        System.out.print("Enter the number of guidance logs with Supervisor 2: ");
        int supervisor2 = sc.nextInt();

        if (compensationStatus.equalsIgnoreCase("Yes")) {
            if (supervisor1 >= 8 && supervisor2 >= 4) {
                message = "All requirements are met. The atudent may register for the thesis exam.";
            }else if (supervisor1 < 8 && supervisor2 >=4) {
                message = "Failed : Guidance logs with Supervisor 1 are less than 8.";   
            }else if (supervisor1 >= 8 && supervisor2 <4) {
                message = "Failed : Guidance logs with Supervisor 2 are less than 4.";
            } else {
                message="Failed : Guidance logs with Supervisor 1 are less than 8 and Supervisor 2 are less than 4.";
            }  
        } else {
            message = "Failed : The student has not been cleared of compensation.";
        }
        System.out.println(message);
        sc.close();
    }
}