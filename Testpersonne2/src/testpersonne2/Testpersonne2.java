package testpersonne2;


public class Testpersonne2 {

    
    public static void main(String[] args) {
        Personne unePersonne = new Personne();
        unePersonne.affiche();
        
        Personne uneautrePersonne = new Personne ("Lea",'F',42);
        uneautrePersonne.affiche();
    }
    
}
