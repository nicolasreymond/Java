package exmethode;

import java.util.Scanner;

public class ExMethode {

    public static void main(String[] args) {
        int r, h;
        double pi = 3.14159;
        System.out.println("Saisir le rayon !");
        Scanner scan = new Scanner(System.in);
        r = scan.nextInt();

        System.out.println("Saisir la hauteur !");
        Scanner scan2 = new Scanner(System.in);
        h = scan2.nextInt();

        circonferance(pi, r);
        air(pi, r);
        air2(pi, r, h);
        volume(pi, r, h);
    }

    public static void circonferance(double pi, int r) {
        System.out.println(2 * pi * r);

    }

    public static void air(double pi, int r) {
        System.out.println(pi * (r * r));
    }

    public static void air2(double pi, int r, int h) {
        System.out.println(2 * (pi * r * r) + (2 * pi * r) * h);

    }

    public static void volume(double pi, int r, int h) {
        System.out.println(pi * (r * r) * h);
    }
}
