package MidExam;

import java.util.Scanner;

public class IrgiWahyuKaliska_CafeDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input the time and temperature
        System.out.print("Enter the time (morning/afternoon/evening): ");
        String time = sc.next();

        System.out.print("Enter drink temperarure (hot/cold): ");
        String temperature = sc.next();

        // base price
        int morningHot = 15000;
        int morningCold = 18000;    
        int afternoonHot = 20000;
        int afternoonCold = 22000;
        int eveningHot = 17000;
        int eveningCold = 19000;

        // calculate discount and total payment
        if (time.equalsIgnoreCase("morning") && temperature.equalsIgnoreCase("hot")) {
            System.out.println("The base price is Rp. 15.000\nDiscount : 10% " + (morningHot *0.10) + " discount\nTotal payment is Rp. " + (morningHot - (morningHot *0.10)));

        } else if (time.equalsIgnoreCase("morning") && temperature.equalsIgnoreCase("cold")) {
            System.out.println("The base price is Rp. 18.000\nDiscount : 10% " + (morningCold *0.10) + " discount\nTotal payment is Rp. " + (morningCold - (morningCold *0.10)));

        } else if (time.equalsIgnoreCase("afternoon") && temperature.equalsIgnoreCase("hot")) {
            System.out.println("The base price is Rp. 20.000\nDiscount : 5% " + (afternoonHot *0.05) + " discount\nTotal payment is Rp. " + (afternoonHot - (afternoonHot *0.05)));

        } else if (time.equalsIgnoreCase("afternoon") && temperature.equalsIgnoreCase("cold")) {
            System.out.println("The base price is Rp. 22.000\nDiscount : 5% " + (afternoonCold *0.05) + " discount\nTotal payment is Rp. " + (afternoonCold - (afternoonCold *0.05)));
        } else if (time.equalsIgnoreCase("evening") && temperature.equalsIgnoreCase("hot")) {
            System.out.println("The base price is Rp. 17.000\nDiscount : 15% " + (eveningHot *0.15) + " discount\nTotal payment is Rp. " + (eveningHot - (eveningHot *0.15)));

        } else if (time.equalsIgnoreCase("evening") && temperature.equalsIgnoreCase("cold")) {
            System.out.println("The base price is Rp. 19.000\nDiscount : 15% " + (eveningCold *0.15) + " discount\nTotal payment Rp. " + (eveningCold - (eveningCold *0.15)));

        } else {
            System.out.println("Invalid input Invalid input. Please make sure time = (morning/afternoon/evening) and temperature = (hot/cold).");
        }   

        // close scanner
        sc.close();

    }
}
