package testpersonne;

public class TestPersonne {

    public static void main(String[] args) {
        //Instencier

        Personne elève1 = new Personne();
        Personne elève2 = new Personne();

        elève1.SetNom("Lucette");
        elève1.SetSexe('F');
        elève1.SetAge(42);

        elève2.nom = "lucien";
        elève2.sexe = 'M';
        elève2.age = 2;

        //Afficher les données d'une personne
        System.out.println("Nom : " + elève1.GetNom());
        System.out.println("Sexe : " + elève1.GetSexe());
        System.out.println("Age : " + elève1.GetAge());
    }

}
