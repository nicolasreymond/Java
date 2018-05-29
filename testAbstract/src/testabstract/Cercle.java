package testabstract;

public class Cercle extends Forme {
    public static final double PI = 3.141592;
    //Atribut
    protected double rayon;
    
    //constructeur
    public Cercle(double rayon){
        this.rayon = rayon;
    }
    
    //Métode
    public double Aire(){
        return(PI*this.rayon*this.rayon);
    }
    public double Perimetre(){
        return(2*PI*this.rayon);
    }
    public void Dessine(){
        System.out.println("lol je suis un Cercle");
    }
}
