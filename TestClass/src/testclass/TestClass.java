
package testclass;


public class TestClass {

    
    public static void main(String[] args) {
        Ville uneVille = new Ville("Echallens", 5000, "VD");
        
        uneVille.affiche();
        
        Ville uneVille2 = new Ville();
        
        uneVille2.nom = "Remaufens";
        uneVille2.taille = 1500;
        uneVille2.canton = "FR";
        
        uneVille2.affiche();
        
        Capitale uneCapitale = new Capitale();
        uneCapitale.nom = "Zurich";
        uneCapitale.taille = 5000;
        uneCapitale.canton = "VD";
        uneCapitale.pays = "Suisse";
        uneCapitale.monument = "Jet d'eau";
        
        uneCapitale.affiche();
        uneCapitale.affiche();
        
        
        Capitale capitale2 = new Capitale("Paris", 8000, "73", "Frrance", "Rien");
        capitale2.affiche();
    }
    
}
