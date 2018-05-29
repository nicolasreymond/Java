package testmetode1;


public class TestMetode1 {

    
    public static void main(String[] args) {
        
        /*Instanciation de la classe Personne
        Crée une copie en mémoir 
        → un objet Personne existe en mémoir*/
        
        Personne Etudient1 = new Personne();
        
        Etudient1.nom = "Didier";
        Etudient1.sexe = 'F';
        Etudient1.age = 42;
        
        
        Personne Etudient2 = new Personne("Jeanne",'M',69);
        
        
        System.out.println("Etudiant1 : ");
        Etudient1.Affiche();
        
        System.out.println("Etudiant2 : ");
        Etudient2.Affiche();
        
        
    }
    
}
