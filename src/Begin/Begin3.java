package Begin;

import java.util.Scanner;

public class Begin3 {
    public static void main(String[] args) {
        Scanner ok=new Scanner(System.in);
        System.out.print(" enter the side of a square = ");
        int a=ok.nextInt();
        System.out.println(" Square is "+Math.pow(a,2) );
        System.out.println(" Perimeter is "+4*a );
    }


}
