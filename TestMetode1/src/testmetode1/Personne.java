package testmetode1;


public class Personne {
    
    //Attributs
    public String nom;
    public char sexe;
    public int age;
    
    //Constructeur
    public Personne (){
        nom = new String();
        sexe = ' ';
        age = 0;
    }
    
    //Méthode 
    public Personne(String NomPrenom, char SexePersonne, int AgePersonne){
        nom = NomPrenom;
        sexe = SexePersonne;
        age = AgePersonne;
    
    }
    public void Affiche(){
        System.out.println("nom : " + nom);
        System.out.println("sexe : " + sexe);
        System.out.println("age : " + age); 
    }
    
}
