package For;

import java.util.Scanner;

public class If12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N  = ");
        int a = sc.nextInt();
        double x = 1;
        double t = 1;
        for (double i = 1; i < a; i++) {

            t = t + 0.1;
            x = x * t;


        }
        System.out.print(Math.abs(x));


    }
}
