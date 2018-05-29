package searchint;

import java.util.Scanner;

public class SearchInt {

    public static void main(String[] args) {
        int nombre = 0, lower = 1, higher = 100;
        boolean retry = true;
        boolean ok = false;
        int random = (int) (Math.random() * (higher - lower)) + lower;

        while (!ok || nombre <= 0 || nombre >= 100 ) {
            System.out.println("\nTrouvez un nombre entrier entre 1 et 100 !");
            Scanner scan = new Scanner(System.in);
            nombre = scan.nextInt();

            if (nombre < random) {
                System.out.println("trop petit");
            } else if (nombre > random) {
                System.out.println("Trop grand");
            } else {
                System.out.println("Bravo !!!");
                ok = true;
            }

        }
    }
}
