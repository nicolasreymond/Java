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
public class Capitale extends Ville{
    //Attributs
    protected String pays;
    protected String monument;
    
    //Constructeur par défaut
    public Capitale(){
        super();
        this.pays = "";
        this.monument = "";
        System.out.println("Une capitale a été crée :-)");
    }
    
    //Constructeur comlémentaire
    public Capitale(String nomVille, int tailleVille, String cantonVille, String paysCapitale, String monumentCapitale){
        super(nomVille, tailleVille, cantonVille);
        this.pays = paysCapitale;
        this.monument = monumentCapitale;
        System.out.println("Une capitale a été crée ;-)");
    }
    
    //Méthodes
    void afficheCapitale(){
        super.affiche();
        System.out.println("PAYS :" + this.pays);
        System.out.println("MONUMENT :" + this.monument);
    }
}
