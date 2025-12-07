package jobsheet11;
import java.util.Scanner;
public class hitungBalok {

    static int hitungLuas(int pjg, int lb) {
        int Luas = pjg * lb;
        return Luas;
    }
    static int hitungVolume(int tinggi, int a, int b) {
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p, l, t, L, vol;

        System.out.print("Enter Length: ");
        p = sc.nextInt();

        System.out.print("Enter Width: ");
        l = sc.nextInt();

        System.out.print("Enter Height: ");
        t = sc.nextInt();   

        // L = p * l;
        // System.out.println("The area is: " + L);
        // vol = p * l * t;
        // System.out.println("The volume is: " + vol);

        L = hitungLuas(p, l);
        System.out.println("The area is: " + L);

        vol = hitungVolume(t, p, l);
        System.out.println("The volume is: " + vol);
        
        sc.close();
    }
}
