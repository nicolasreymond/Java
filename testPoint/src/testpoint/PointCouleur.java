
package testpoint;


public class PointCouleur extends point{
    public char Couleur;
    
    public PointCouleur(int x, int y, char coul){
        super(x, y);
        this.Couleur=coul;
    }
    
    public void Affiche(){
        super.Affiche();
        System.out.println("Ma couleur est : " + this.Couleur);
    }
    
    public void Identifie()
    {
        super.Identifie();
        System.out.println("Je suis un POINT de couleur ;-)");
    }
   
}
