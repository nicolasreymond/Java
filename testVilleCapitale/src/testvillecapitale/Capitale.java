package testvillecapitale;

public class Capitale extends Ville {

    protected String pays;
    protected String monument;

    public Capitale() {

        super();

        this.pays = "";
        this.monument = "";
    }

    public Capitale(String nomV, int tailleV, String cantonV, String paysC, String monumentC) {

        super(nomV, tailleV, cantonV);

        this.pays = paysC;
        this.monument = monumentC;
    }

    @Override
    public void affiche() {
        System.out.print("NOM: " + this.nom + "\n" + "TAILLE: " + this.taille + "\n" + "CANTON: " + this.canton + "\n" + "PAYS: " + this.pays + "\n" + "MONUMENT: " + this.monument + "\n");
    }
}
