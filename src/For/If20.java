package For;

import java.util.Scanner;

public class If19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        int fact=1;
        for (int i = 1; i <=n ; i++) {

            fact*=i;
        }System.out.print(fact);


    }
}
