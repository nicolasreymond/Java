package testpersonne2;

public class Personne {

    //Atribut
    private String nom;
    private char sexe;
    private int age;
    private String comuniquer;

    //Constructeur par défaut
    public Personne() {
        nom = new String();
        sexe = ' ';
        age = 0;
        comuniquer = "";
    }

    public Personne(String nomPers, char SexePers, int AgePers) {
        nom = nomPers;
        sexe = SexePers;
        age = AgePers;
    }

    //Méthode membre
    public void affiche() {
        System.out.println("NOM " + this.nom);
        System.out.println("SEXE " + this.sexe);
        System.out.println("AGE " + this.age);
    }

    //Mutateur
    public void SetNom(String nomPers) {
        nom = nomPers;
    }

    public void SetSexe(char sexePers) {
        sexe = sexePers;
    }

    public void SetAge(int agePers) {
        age = agePers;
    }
}
