package Function_Programs;

import java.util.Scanner;

public class Reverve_Number {
    public static void main(String[] args) {
        // int n = 12345;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number=");
        int n = sc.nextInt();
        int rev = 0;
        int d = 0;

        while (n > 0) {

            d = n % 10;
            rev = d + (rev * 10);
            n /= 10;

        }
        System.out.println(rev);
    }

}
