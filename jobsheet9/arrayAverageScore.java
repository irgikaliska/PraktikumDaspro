package jobsheet9;

import java.util.Scanner;

public class arrayAverageScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//         int[] score = new int[10];
//         double total = 0;
//         double average;

//         for (int i = 0; i < score.length; i++) {
//             System.out.print("Enter student score " + (i + 1) + ": ");
//             score[i] = sc.nextInt();
//         }
//         for (int i = 0; i  < score.length; i++) {
//             total += score[i];
//             if (score[i] > 70){
//                 System.out.println("Student " + i + " Passed!");
//             }else
//             System.out.println("Student " + i + " Failed!");
//         }
        
//         average = total / score.length;
//         System.out.println("The class average score is " + average);

        System.out.print("Enter the number of student : ");
        int n = sc.nextInt();
        int[] score = new int[10];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the final score " + " : ");
            score[i] = sc.nextInt();
        }
        
        double sumPassed = 0;
        double sumFailed = 0;
        int countPassed = 0;
        int countFailed = 0;

        for (int i = 0; i < n; i++) {
            if (score[i] > 70) {
                sumPassed += score[i];
                countPassed++;
            } else {
                sumFailed += score[i];
                countFailed++;
            }
        }
        double avgPassed = sumPassed / countPassed;
        double avgFailed = sumFailed / countFailed;

        System.out.println("The average score of the passed students is: " + avgPassed);
        System.out.println("The average score of the failed students is: " + avgFailed);

    }
}
