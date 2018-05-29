
package testpoint;

public class TestPoint {

   
    public static void main(String[] args) {
        point p1 = new point(10, 100);
        
        p1.Affiche();
        p1.Identifie();
        
        PointCouleur p42 = new PointCouleur(100, 1000, 'R');
        
        p42.Affiche();
        p42.Identifie();
        
        p1 = p42;
        
        p1.Identifie();
    }
    
    
}
