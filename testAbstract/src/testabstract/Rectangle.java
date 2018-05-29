package testabstract;


public class Rectangle extends Forme{
        //Atribut
    protected double longueur;
    protected double largeur;
    
    //constructeur
    public Rectangle(double longueur, double largeur){
        this.longueur = longueur;
        this.largeur = largeur;
    }
    
    //Métode
    public double Aire(){
        return(this.largeur*this.longueur);
    }
    public double Perimetre(){
        return(2*this.longueur + 2*this.largeur);
    }
    public void Dessine(){
        System.out.println("lol je suis un Reclangle");
    }
}
