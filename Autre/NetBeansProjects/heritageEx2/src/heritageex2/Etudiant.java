/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heritageex2;

/**
 *
 * @author loic
 */
public class Etudiant extends Personne {
    private String matricule ="";
    protected String formation="";
    
    public Etudiant(){
        System.out.println("Un objet ETUDIANT a été créé ;-)");
    }
    
    public Etudiant (String nom, char sexe, int age, String matricule, String formation) {
        this.setNom(nom);
        this.setAge(age);
        this.setSexe(sexe);
        this.matricule=matricule;
        this.formation=formation;
    }
    
    void affiche () {
        super.affiche();
        System.out.println("Caractéristiques d'Etudiant " + getNom());
        System.out.println("Matricule :" + matricule);
        System.out.println("Formation :" + formation);
    }
    
}
