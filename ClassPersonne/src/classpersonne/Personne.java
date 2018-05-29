package classpersonne;


public class Personne {
    //Atribut
    private String nom;
    private char sexe;
    private int age;
    
    //Constructeur pas défaut
    public Personne (){
        nom=new String();
        sexe=' ';
        age=0;  
    }
    
    //Méthode 
    
    //Mutateur
    public void affice(){
        System.out.println("NOM : " + this.nom);
        System.out.println("SEXE : " + this.sexe);
        System.out.println("AGE : " + this.age);
    }
}