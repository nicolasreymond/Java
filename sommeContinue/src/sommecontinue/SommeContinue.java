package sommecontinue;

import java.util.*;


public class SommeContinue {

    public static void main(String[] args) {
        int nombre = 0;
        while (nombre < 1 || nombre > 127) {
            System.out.println("Saisir nombre entrière [1 et 127] !");
            Scanner scan = new Scanner(System.in);
            nombre = scan.nextInt();
        }
        int total = 0;
        while (nombre >= 1) {            
            total = total + nombre;
            nombre--;
        }
        System.out.println(total);
    }
    
}
