package testvillecapitale;

public class TestVilleCapitale {

    public static void main(String[] args) {
        Ville ville1 = new Ville();
        ville1.nom = "Lausanne";
        ville1.taille = 137810;
        ville1.canton = "VD";

        Ville ville2 = new Ville("Froideville", 42, "VD");

        Capitale capitale1 = new Capitale("London", 1000000000, "--", "Grande-Bretagne", "BigBen");

        System.out.println("VILLE1");
        ville1.affiche();
        System.out.println("");
        
        System.out.println("VILLE2");
        ville2.affiche();
        System.out.println("");
         
        System.out.println("CAPITALE");
        capitale1.affiche();
        System.out.println("");
    }

}
