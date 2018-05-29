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
public class Personne {
    private String nom;
    private char sexe;
    private int age;
    
    public Personne(String nom, int age){
        this(nom, 'u', age);
    }
    
    public Personne(){
        this("", 'u', 100);
    }
    
    public Personne(String nom, char sexe, int age){
        this.nom = nom;
        this.age=age;
        this.sexe=setSexe(sexe);
        System.out.println("Un objet PERSONNE a été créé ;-)");

    }
    
    public String getNom(){
        return nom;
    }
    
    public String setNom(String nouveauNom){
        nom = nouveauNom;
        return nom;
    }
    
    public char getSexe(){
        return this.sexe;
    }
    
    public char setSexe(char newSexe){
        if(newSexe=='f'||newSexe=='m'||newSexe=='u'){
            sexe=newSexe;
        }
        
        return sexe;
    }
    
    public int setAge(int age) {
        this.age = age;
        return this.age;
    }
    
    void affiche (){
        System.out.println("Caractéristiques de " + nom);
        System.out.println("SEXE :" + sexe);
        System.out.println("AGE :" + age);
    }
}
