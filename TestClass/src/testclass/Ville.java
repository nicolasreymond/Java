
package testclass;


public class Ville {
    
    protected String nom;
    protected int taille;
    protected String canton;
    
    
    public Ville (){
        nom = new String("");
        taille = 0;
        canton = new String("");
    }
    
    public Ville (String nomVille, int tailleVille, String cantonVille){
        nom = nomVille;
        taille = tailleVille;
        canton = cantonVille;
    }
    
    public void affiche(){
        System.out.println("nom : " + this.nom);   
        System.out.println("taille : " + this.taille);
        System.out.println("canton : " + this.canton);


    }
}
