package plusgrand;

import java.util.*;

public class PlusGrand {

    public static void main(String[] args) {
        int nombre = 1;
        int tour = 1;
        int bigInt = 0;
        System.out.println("Vous êtes au tour N° " + tour + "\n");
        while (nombre != 0) {
            System.out.println("Saisir nombre entrière [1 et 127] !");
            tour++;
            Scanner scan = new Scanner(System.in);
            nombre = scan.nextInt();
            if (nombre > bigInt) {
                bigInt = nombre;
                System.out.println("Le nomrbe le plus grand est : " + bigInt + "\n" + "\n");
            } else if (nombre < bigInt && nombre != 0) {

                System.out.println("plus petit que " + bigInt + "\n" + "\n");

            }
        }

    }
}
