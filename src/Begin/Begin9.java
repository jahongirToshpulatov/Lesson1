package Begin;

import java.util.Scanner;

public class Begin9 {
    public static void main(String[] args) {
        Scanner ok=new Scanner(System.in);
        System.out.print(" enter the first number = ");
        int a=ok.nextInt();
        System.out.print("enter the second number = ");
        int b=ok.nextInt();
        System.out.println(" geometrical mean "+Math.sqrt(a*b) );
    }
}
