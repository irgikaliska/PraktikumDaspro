package jobsheet10;

import java.util.Scanner;
public class temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double temp[][] = new double[5][7];
        String [] cities = {"Osaka", "Tokyo", "Sapporo", "Fukuoka", "Naka"};

        for (int i = 0; i < temp.length; i++){
            for (int j = 0; j < temp[0].length; j++){
                temp[i][j] = input.nextDouble();
            }
        }

        for (double[] cityTemp:temp){
            for(double dayTemp: cityTemp){
                System.out.print(dayTemp + " - ");
            }
            System.out.println();
        }
    }
}
