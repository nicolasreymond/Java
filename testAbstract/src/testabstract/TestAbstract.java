package testabstract;

public class TestAbstract {

    public static void main(String[] args) {
        
        //Forme maForme = new Forme();
        
        Forme [] mesFormes = new Forme[3];
        
        mesFormes[0] = new Cercle(12.5);
        System.out.println("Cercle    :");
        System.out.println("Perimetre : " + mesFormes[0].Perimetre());
        System.out.println("Aire      : " + mesFormes[0].Aire());
        mesFormes[0].Dessine();
        
        mesFormes[1] = new Triangle(4, 3);
        System.out.println("\nTriangle  : ");
        System.out.println("Perimetre : " + mesFormes[1].Perimetre());
        System.out.println("Aire      : " + mesFormes[1].Aire());
        mesFormes[1].Dessine();

        mesFormes[2] = new Rectangle(4, 10);
        System.out.println("\nRectangle :");        
        System.out.println("Perimetre : " + mesFormes[2].Perimetre());
        System.out.println("Aire      : " + mesFormes[2].Aire());
        mesFormes[2].Dessine();

    }
    
}
