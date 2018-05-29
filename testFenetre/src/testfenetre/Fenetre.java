package testfenetre;

import java.awt.*;
import javax.swing.*;

public class Fenetre extends JFrame {

    public Fenetre() {

        // Titre
        this.setTitle("Une fenêtre Java avec objet graphique");

        // Taille
        this.setSize(600, 600);

        // Position par défaut
        this.setLocationRelativeTo(null);

        // Informer JFrame que notre JPanel sera son conteneur
        this.setContentPane(new Panneau());

        // Action si bouton fermeture activé
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Rendre visible
        this.setVisible(true);
    }
}
