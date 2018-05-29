package paireoupas;

import java.util.Scanner;

public class PaireOuPas {

    public static void main(String[] args) {
        int nombre = 0;
        while (nombre < 1 || nombre > 127) {
            System.out.println("Saisir nombre entrière [1 et 127] !");
            Scanner scan = new Scanner(System.in);
            nombre = scan.nextInt();
        }
        System.out.println("Vous avez choisi le nombre " + nombre);
        if (nombre % 2 == 0) {
            System.out.println("Le nombre est paire !!");
        } else {
            System.out.println("Le nombre est impaire !!");

        }
    }

}
    