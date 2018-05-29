package tablemulti;

import java.util.*;

public class TableMulti {

    public static void main(String[] args) {
        int nombre = 0;
        while (nombre < 1 || nombre > 12) {
            System.out.println("Saisir nombre entrière [1 et 12] !");
            Scanner scan = new Scanner(System.in);
            nombre = scan.nextInt();
        }
        System.out.println("Vous avez choisi la table " + nombre);
        for (int decrem = 1; decrem <= 12; decrem++) {
            System.out.println(decrem + " * " + nombre + " = " + decrem * nombre);
        }
    }
}
