package jobsheet11;
import java.util.Scanner;
public class nilaiMahasiswa {
    public static void main(String[] args) {
        int N = 5;
        int[] score = new int [N];
        score = input(N);
        output(score);
        System.out.println("sum =" + sum(score));
    }

    static int sum(int[] x){
        int result = 0;
        for(int i = 0; i < x.length; i++){
            result += x[i];
        }
        return result;
    }
    static void output(int[] x){
        for(int i = 0; i < x.length; i++){
            System.out.print(x[i] + ", ");
        }
        System.out.println();
    }
    static int[] input(int n){
        int[] x = new int [n];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < n; i++){
            x[i] = sc.nextInt();
        }
        return x;
    }
}