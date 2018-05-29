/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_personne;
    

public class Personne {
    // Constructeur
    public Personne()
    {
        nom = new String("");
        sexe = ' ';
        age = 0;
    }
    // Méthodes membres
        // Mutateurs
        public void SetNom(String nomPersonne)
        {
            this.nom = nomPersonne;
        }
        
        public void SetSex(char sexePersonne)
        {
            this.sexe = sexePersonne;
        }
        
        public void SetAge(int agePersonne)
        {
            this.age = agePersonne;
        }
    
        // Ascencseur
        public String GetNom()
        {
            return this.nom;
        }
        
        public char GetSexe()
        {
            return this.sexe;
        }
        
        public int GetAge()
        {
            return this.age;
        }

    // Attributs
    private String nom;
    private char sexe;
    private int age;
}
