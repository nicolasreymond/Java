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
public class HeritageEx2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Etudiant Etudiant1 = new Etudiant("Paul", 'm', 17, "199468", "Très élevée");
       Etudiant1.affiche();
       //Etudiant1.sexe = 'f';
       Etudiant1.affiche();
    }
    
}
