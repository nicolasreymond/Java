package rectanglechiffrecolonne;

import java.util.*;

public class RectangleChiffreColonne {

    public static void main(String[] args) {
        int height, width, tot, init = 1;

        System.out.println("Saisir nombre !");
        Scanner scan1 = new Scanner(System.in);
        height = scan1.nextInt();

        System.out.println("Saisir nombre !");
        Scanner scan2 = new Scanner(System.in);
        width = scan2.nextInt();

        System.out.println("height : " + height);
        System.out.println("width : " + width);

        tot = height * width;
        System.out.println("tot : " + tot);

        for (int i = height; i > 0; i--) {
            for (int j = width; j > 0; j--) {
                System.out.print(" " + init);
                init++;

            }
            System.out.println("");
        }
    }
    
}
