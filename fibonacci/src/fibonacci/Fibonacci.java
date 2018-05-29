package fibonacci;

public class Fibonacci {

    public static void main(String[] args) {
        long nombre1 = 1;
        long nombre2 = 2;
        long nombreSuit = 1;
        for (int i = 0; i < 100; i++) {
            System.out.println(i + " " + nombreSuit);
            nombreSuit = nombre1 + nombre2;
            nombre1 = nombre2;
            nombre2 = nombreSuit;
        }
    }

}
