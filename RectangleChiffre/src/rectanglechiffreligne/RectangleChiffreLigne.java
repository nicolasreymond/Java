package rectanglechiffreligne;

import java.util.*;

public class RectangleChiffreLigne {

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

        for (int i = width; i > 0; i--) {
            for (int j = height; j > 0; j--) {
                System.out.print(" " + init);
                init++;

            }
            System.out.println("");
        }
    }
}
