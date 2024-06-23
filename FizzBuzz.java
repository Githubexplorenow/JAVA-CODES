package Function_Programs;

public class FizzBuzz {

    public static void FizzBuzz(int n) {
        for (int i = 0; i <= 15; i++) {

            if (i % 15 == 0) {
                System.out.println("fizzbuzz");
            }

            else if (i % 5 == 0) {
                System.out.println("Buzz");

            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {

    }
}
