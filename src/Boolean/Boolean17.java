package Boolean;

import java.util.Scanner;

public class Boolean17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A = ");
        int a = sc.nextInt();
        boolean d=a>99&&a<1000&&a%2==1;
        System.out.print(d);
    }
}
