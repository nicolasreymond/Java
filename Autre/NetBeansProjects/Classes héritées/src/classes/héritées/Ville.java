/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.héritées;

/**
 *
 * @author loic
 */
public class Ville {
    // Attributs
    protected String nom;
    protected int taille;
    protected String canton;
    
    // Constructeur par défaut
    public Ville(){
        nom = "";
        taille = 0;
        canton = "";
        System.out.println("Un objet VILLES a été créé ;-)");
    }
    
    // Contructeur supplémentaire
    public Ville (String nomVille, int tailleVille, String cantonVille){
        nom = nomVille;
        taille = tailleVille;
        canton = cantonVille;
        System.out.println("Un objet VILLE a été créé ;-)");
    }
    
    // Méthodes
    void affiche (){
        System.out.println("Caractéristiques de " + nom);
        System.out.println("HABITANTS :" + taille);
        System.out.println("CANTON :" + canton);
    }
}


