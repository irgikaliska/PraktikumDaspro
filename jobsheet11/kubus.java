package jobsheet11;

public class kubus {

    static int calculateAll(int s){
        return s*s*s;
    }
    static int calculateArea(int s){
        return 6*s*s;
    }
    public static void main(String[] args) {
        System.out.println(calculateAll(5));
        System.out.println(calculateArea(5));
    }
}
