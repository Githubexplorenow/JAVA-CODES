// // // // // // package PrimeNumberPrograms;

// // // // // // import java.util.Scanner;

// // // // // // public class PrimeNumber {
// // // // // //     public static void main(String[] args) {
// // // // // //         // those number which is divisible by itselff only considered as prime number;
// // // // // //         // such as 2,3,5,7,11 etc.

// // // // // //         int num, count = 0;
// // // // // //         System.out.println("enter any number:");
// // // // // //         Scanner sc = new Scanner(System.in);
// // // // // //         num = sc.nextInt();

// // // // // //         for (int i = 1; i <= num; i++) {

// // // // // //             if (num % i == 0) {

// // // // // //                 count++;
// // // // // //             }
// // // // // //         }

// // // // // //         if (count == 2)
// // // // // //             System.out.println(num + " is prime");

// // // // // //         else {
// // // // // //             System.out.println(num + "is not a Prime");
// // // // // //         }

// // // // // //     }

// // // // // // }

// // // // // package PrimeNumberPrograms;

// // // // // import java.util.Scanner;

// // // // // /**
// // // // //  * PrimeNumber
// // // // //  */
// // // // // public class PrimeNumber {

// // // // //     public static void main(String[] args) {

// // // // //         Scanner s = new Scanner(System.in);
// // // // //         System.out.println("enter no to check :");
// // // // //         int num = s.nextInt();
// // // // //         int count = 0;

// // // // //         for (int i = 1; i <= num; i++) {

// // // // //             if (num % i == 0) {
// // // // //                 count++;
// // // // //             }

// // // // //         }
// // // // //         if (count == 2) {
// // // // //             System.out.println("prime number");

// // // // //         } else {
// // // // //             System.out.println("not a prime number");
// // // // //         }

// // // // //     }
// // // // // }

// // // // // code for prime number by using while loop
// // // // package PrimeNumberPrograms;

// // // // import java.util.Scanner;

// // // // /**
// // // //  * PrimeNumber
// // // //  */
// // // // public class PrimeNumber {

// // // //     public static void main(String[] args) {
// // // //         Scanner r = new Scanner(System.in);
// // // //         System.out.println("total input:");
// // // //         int n = r.nextInt();

// // // //         int i = 1, count = 0, num = 2;

// // // //         if (num % i == 0) {
// // // //             {
// // // //                 i++;
// // // //             }
// // // //             count++;

// // // //         }

// // // //         if (count == 2) {
// // // //             System.out.println(num);
// // // //         }
// // // //     }
// // // // }

// // // // write a code to print prime number between 1 to 100

// // // package PrimeNumberPrograms;

// // // /**
// // //  * PrimeNumber
// // //  */
// // // public class PrimeNumber {

// // //     public static void main(String[] args) {

// // //         int i, j, count;

// // //         for (i = 1; i <= 100; i++) {

// // //             count = 0;

// // //             for (j = 1; j <= i; j++) {
// // //                 if (i % j == 0)
// // //                     count++;

// // //             }

// // //             if (count == 2) {

// // //                 System.out.println(i);
// // //             }

// // //         }

// // //     }
// // // }

// // package PrimeNumberPrograms;

// // /**
// //  * PrimeNumber
// //  */
// // public class PrimeNumber {

// //     public static void main(String[] args) {

// //         int i, j, count;

// //         for (i = 1; i <= 100; i++) {
// //             count = 0;
// //             for (j = 1; j <= i; j++) {
// //                 if (i % j == 0)
// //                     count++;

// //             }
// //             if (count == 2) {
// //                 System.out.println(i);
// //             }

// //         }
// //     }
// // }

// package PrimeNumberPrograms;

// import java.util.Scanner;

// /**
//  * PrimeNumber
//  */
// public class PrimeNumber {

//     public static void main(String[] args) {
//         int n = 1, i, count = 0;

//         Scanner s= new Scanner(System.in);
//         System.out.println("enter the number:");
//          n=s.nextInt();

//         int n = 1, i, count = 0;

//         for (i = 1; i < n; i++) {

//             if (i % n == 0)

//                 count++;
//         }

//         if (count == 2) {
//             System.out.println(i);
//         }
//     }
// }

package PrimeNumberPrograms;

import java.util.Scanner;

/**
 * PrimeNumber
 */
public class PrimeNumber {

    public static void main(String[] args) {

        int n = s.nextInt();
        int count;

        for (int i = 1; i <= 100; i++) {
            count = 0;

            for (int j = 1; j <= i; j++) {

                if (i % j == 0)

                    count++;

            }

            if (count == 2) {
                System.out.println(i);
            }

        }

    }
}