
package testclass;


public class Capitale extends Ville{
    String pays;
    String monument;
    
    public Capitale(){
        super();
        pays = new String("");
        monument = new String("");
    }
   
    public Capitale(String nomVille, int tailleVille, String cantonVille, String paysCapitale, String monumentCapitale){
        super(nomVille, tailleVille, cantonVille);
        pays = paysCapitale;
        monument = monumentCapitale;
    }
    
    public void affiche(){
        super.affiche();
        System.out.println("pays : " + this.pays);
        System.out.println("monument : " + this.monument);
    }
}
