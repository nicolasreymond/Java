
package test_personne;


public class Test_Personne {

   
    public static void main(String[] args) {
        
        // Instancier la classe -> créer un objet personne dans la mémoire
        Personne Eleve1 = new Personne();
        
        // Ecrire dans l'objet Eleve1
        Eleve1.SetNom("Tristan Burban");
        Eleve1.SetSex('M');
        Eleve1.SetAge(18);
        
        // Lire dans l'objet Eleve1
        System.out.println("Nom : " + Eleve1.GetNom());
        System.out.println("Age : " + Eleve1.GetAge());
        System.out.println("Sexe : " + Eleve1.GetSexe());
        
        Personne Eleve2 = new Personne();
        
        Eleve2.SetNom("Dylan Metral");
        Eleve2.SetAge(20);
        Eleve2.SetSex('F');
        
        System.out.println("Nom : " + Eleve2.GetNom());
        System.out.println("Age : " + Eleve2.GetAge());
        System.out.println("Sexe : " + Eleve2.GetSexe());
    }
    
    
}
