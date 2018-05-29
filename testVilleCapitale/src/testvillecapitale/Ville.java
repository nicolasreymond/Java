/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testvillecapitale;

/**
 *
 * @author nreymond
 */
public class Ville {

    protected String nom;
    protected int taille;
    protected String canton;

    public Ville() {
        this.canton = "";
        this.taille = 0;
        this.nom = "";
    }

    public Ville(String nomV, int tailleV, String cantonV) {
        this.canton = cantonV;
        this.taille = tailleV;
        this.nom = nomV;
    }

    public void affiche() {
        System.out.print("NOM: " + this.nom + "\n" + "TAILLE: " + this.taille + "\n" + "CANTON: " + this.canton + "\n");
    }
}
