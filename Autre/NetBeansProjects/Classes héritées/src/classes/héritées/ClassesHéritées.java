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
public class ClassesHéritées {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Nouvelles Villes
        Ville ville1 = new Ville();
        ville1.nom = "Morges";
        ville1.taille = 15000;
        ville1.canton = "Vaud";
        
        Ville ville2 = new Ville ("Yverdon",26000,"Vaud");
        
        // Nouvelles Capitales
        Capitale capitale1 = new Capitale();
        Capitale capitale2 = new Capitale("Lausanne",124000,"Vaud","Suisse","Cathédrale");
        
        //Affichage des villes
        ville1.affiche();
        ville2.affiche();
        
        //Affiche les Capitales qui sont des villes (polymorphisme)
        capitale1.affiche();
        capitale2.affiche();
        
        //Affiche les Capitales
        capitale1.afficheCapitale();
        capitale2.afficheCapitale();
    }
    
}
