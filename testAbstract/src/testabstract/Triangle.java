package testabstract;

public class Triangle extends Forme {
    //Atribut
    protected double base;
    protected double hauteur;
    
    //constructeur
    public Triangle(double base, double hauteur){
        this.base = base;
        this.hauteur = hauteur;
    }
    
    //Métode
    public double Aire(){
        return(this.base*this.hauteur / 2);
    }
    public double Perimetre(){
        return(3*this.base);
    }
    public void Dessine(){
        System.out.println("lol je suis un Triangle");
    }
}
