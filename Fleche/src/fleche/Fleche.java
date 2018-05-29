package fleche;

import java.util.*;

public class Fleche {

    public static void main(String[] args) {
        int nombre = 0, j, l, x;
        String star;
        star = "*";

        //SCANNER  OK
        while (nombre < 2 || nombre > 20) {
            System.out.println("Saisir nombre entrière [2 et 20] !");
            Scanner scan = new Scanner(System.in);
            nombre = scan.nextInt();
        }
        int m = 0;

        //TOP
        for (int i = nombre / 2; i > 0; i--) {
            j = i;
            l = m;
            x = m - 1;
            while (j > 0) {
                System.out.print(" ");
                j--;
            }
            System.out.print(star);
            while (l > 0) {
                System.out.print(" ");
                if (m > 1) {
                    while (x > 0) {
                        System.out.print(" ");
                        x--;
                    }
                }
                l--;
            }
            if (m != 0) {
                System.out.print(star);
            }
            System.out.println("");
            m++;
        }

        //BOTTOM  OK
        int moitier = nombre / 2;
        if (moitier % 2 == 1) {
            moitier += 1;
        }
        for (int i = 0; i < moitier; i++) {
            for (int space = moitier; space > 0; space--) {
                System.out.print(" ");
            }
            System.out.println(star);
        }
    }
}
