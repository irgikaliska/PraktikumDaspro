package jobsheet10;

import java.util.Scanner;

public class cinemaWithScanner{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String name, next;
        // int row, column;

        // String [][] audience = new String [4][2];

        // while (true) { 
        //     System.out.print("Enter a name: ");
        //     name = sc.nextLine();
        //     System.out.print("Enter row number: ");
        //     row = sc.nextInt();
        //     System.out.print("Enter column number: ");
        //     column = sc.nextInt();
        //     sc.nextLine();

        //     audience[row - 1][column - 1] = name;

        //     System.out.printf("%s \t %s\n", audience[0][0], audience[0][1]);
        //     System.out.printf("%s \t %s\n", audience[1][0], audience[1][1]);
        //     System.out.printf("%s \t %s\n", audience[2][0], audience[2][1]);
        //     System.out.printf("%s \t %s\n", audience[3][0], audience[3][1]);

        //     System.out.print("Are there any other audiences to be added? (y/n): ");    
        //     next = sc.nextLine();

        //     if (next.equalsIgnoreCase("n")) {
        //         break;
        //     }

        
        // }

        String name, next;
        int row, column;

        String[][] audience = new String[4][2];

        while (true) {
            System.out.print("Enter a name: ");
            name = sc.nextLine();

            boolean seatAvailable = false;
            do {
                System.out.print("Enter row number: ");
                row = sc.nextInt();
                System.out.print("Enter column number: ");
                column = sc.nextInt();
                sc.nextLine();

                if (row < 1 || row > 4 || column < 1 || column > 2) {
                    System.out.println("Invalid row or column. Please try again.");
                    continue;
                }

                if (audience[row - 1][column - 1] != null) {
                    System.out.println("Seat is already occupied. Please choose another seat.");
                    continue;
                }

                seatAvailable = true;
            } while (!seatAvailable);

            audience[row - 1][column - 1] = name;

            // System.out.printf("%s \t %s\n", audience[0][0], audience[0][1]);
            // System.out.printf("%s \t %s\n", audience[1][0], audience[1][1]);
            // System.out.printf("%s \t %s\n", audience[2][0], audience[2][1]);
            // System.out.printf("%s \t %s\n", audience[3][0], audience[3][1]);

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 2; j++) {
                    String display = (audience[i][j] == null) ? "**" : audience[i][j];
                    System.out.print(display + "\t");
                }
                System.out.println();
            }

            System.out.print("Are there any other audiences to be added? (y/n): ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
