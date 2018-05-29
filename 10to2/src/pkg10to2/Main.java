package pkg10to2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int number = 0;
        System.out.println("Entrer nombre à convertire");
        try {
            Scanner scan1 = new Scanner(System.in);
            number = scan1.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(e);
        }
        printBinaryform(number);

    }

        private static void printBinaryform(int number) {
            int remainder;

            if (number <= 1) {
                System.out.print(number);
                return;   // KICK OUT OF THE RECURSION
            }

            remainder = number % 2;
            printBinaryform(number >> 1);
            System.out.print(remainder);
        }
}
