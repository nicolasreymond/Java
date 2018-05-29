package moyenne;

import java.util.*;

public class Moyenne {

    public static void main(String[] args) {
        double notes = 0, i, nombre = 0, moyenne;
        long somme = 0, tot = 0;

        System.out.println("combien de notes ?");
        try {
            Scanner scan1 = new Scanner(System.in);
            tot = scan1.nextLong();
            somme = tot;
        } catch (InputMismatchException e) {
            System.out.println("NaN !!!");
        }
        
        
        
        
        while (somme != 0) {
            System.out.println("Saisir nombre entre 1 et 6 !");
            try {
                Scanner scan2 = new Scanner(System.in);
                nombre = scan2.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("NaN !!!");
                nombre = 42;
            }
            if (nombre <= 6 && nombre % 0.5 == 0) {
                notes += nombre;
                somme--;
            } else {
                System.out.println("Trop grand !!");
            }

        }
        moyenne = notes / tot;
        i = moyenne % 1;
        moyenne -= i;

        if (i >= 0.25 && i < 0.75) {
            moyenne += 0.5;
        } else if (i >= 0.75 && i < 1) {
            moyenne += 1;

        } else {

        }
        if (moyenne <= 6) {
            System.out.println("Votre moyenne est de : " + moyenne);

        }
    }

}
