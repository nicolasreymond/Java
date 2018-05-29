
package testpoint;


public class point{
    
    // Attributs
    public int CoordX, CoordY;
   
    // Constructeur
    public point (int x, int y)
    {
        this.CoordX=x;
        this.CoordY=y;
    }

    
    // Méthode(s)
    public void Affiche(){
        System.out.println("Coordonnée POINT ==> X = "+this.CoordX+" ==> Y ="+this.CoordY);
    }
    public void Identifie()
    {
        System.out.println("Je suis un POINT ;-)");
    }
    
}
