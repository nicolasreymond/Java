
package testpersonne;


public class Personne {
    //Atribut
    public String nom;
    public char sexe;
    public int age;
    
    //Constructeur pas défaut
    public Personne (){
        nom=new String();
        sexe=' ';
        age=0;  
    }
    
    //Méthode 
    
    //Mutateur
    public void SetNom(String nomPers){
        nom=nomPers;
    }
    public void SetSexe(char sexePers){
        sexe=sexePers;
    }
    public void SetAge(int agePers){
        age=agePers;
    }
    
    //Accesseurs
    public String GetNom(){
        return nom;
    }
    public char GetSexe(){
        return sexe;
    }
    public int GetAge(){
        return age;
    }
    
}
