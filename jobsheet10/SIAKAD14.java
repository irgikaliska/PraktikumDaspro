package jobsheet10;

import java.util.Scanner;
public class SIAKAD14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int[][] score = new int [4][3];

        // for (int i = 0; i < score.length; i++){
        //     System.out.println("Enter the score for student #" + (i + 1));
        //     double sumForEachStudent = 0;

        //     for (int j = 0; j < score[i].length; j++){
        //         System.out.print("Course #" + (j + 1) + " score : ");
        //         score [i][j] = sc.nextInt();
        //         sumForEachStudent += score [i][j];

        //     }
        //     System.out.println("Average score: " + sumForEachStudent / 3);
        // }

        // for (int j = 0; j < 3; j++){
        //     double sumForEachCourse = 0;

        //     for (int i = 0; i < 4; i++) {
        //         sumForEachCourse += score[i][j];
        //     }

        //     System.out.println("Course " + (j + 1) + ": " + (sumForEachCourse / 4));
        // }


        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        System.out.print("Enter the number of courses: ");
        int numCourses = sc.nextInt();

        // Declare 
        int[][] score = new int[numStudents][numCourses];

        // Input 
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter the score for student #" + (i + 1));
            double sumForEachStudent = 0;

            for (int j = 0; j < numCourses; j++) {
                System.out.print("Course #" + (j + 1) + " score : ");
                score[i][j] = sc.nextInt();
                sumForEachStudent += score[i][j];
            }
            System.out.println("Average score: " + (sumForEachStudent / numCourses));
        }

        // Calculate average per course
        for (int j = 0; j < numCourses; j++) {
            double sumForEachCourse = 0;

            for (int i = 0; i < numStudents; i++) {
                sumForEachCourse += score[i][j];
            }

            System.out.println("Course " + (j + 1) + ": " + (sumForEachCourse / numStudents));
        }
    }
}