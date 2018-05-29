package fenetre.graphique;

import javax.swing.JFrame;

public class MaFenetre extends JFrame {
    
    // Constructeur 
    public MaFenetre()
    {
        this.setTitle("Ma première fenêtre JAVA"); //Titre de la fenêtre
       
        this.setSize(600, 300); //Taille de la fenêtre
        
        this.setLocationRelativeTo(null); //Position de la fenêtre sur l'écran
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Réaction du programme à la fermeture de la fenêtre
        
        MonPanneau pan1 = new MonPanneau();
        this.setContentPane(pan1);
        
        
        this.setVisible(true); //Rendre la fenâtre visible
        
    }
    
}
