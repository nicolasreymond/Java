package textmirroir;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class FenMir extends JFrame implements DocumentListener {

    // Attributs
    private final JTextField saisie, copie;

    // Constructeur
    public FenMir() {
        this.setTitle("Miroir à texte"); //donner titre à la fenêtre
        this.setSize(800, 100); // donne une taille à la fenêtre
        this.setLocationRelativeTo(null); // apparaît au milieu de l'écran
        this.setResizable(false); // ne se redimensionne pas
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// s'arrête à la fermeture de la fenêtre

        Container contenu = getContentPane();
        contenu.setLayout(new FlowLayout());

        saisie = new JTextField(50);
        contenu.add(saisie);
        saisie.getDocument().addDocumentListener(this);

        copie = new JTextField(50);
        copie.setEditable(true);
        copie.setBackground(Color.LIGHT_GRAY);
        copie.setEditable(false);
        contenu.add(copie);

        this.setVisible(true);
    }

    // Redéfinition des méthodes membres classe DocumentListener
    public void insertUpdate(DocumentEvent e) {
        String texte = saisie.getText();
        copie.setText(texte);
    }

    public void removeUpdate(DocumentEvent e) {
        String texte = saisie.getText();
        copie.setText(texte);
    }

    public void changedUpdate(DocumentEvent e) {
    }
}
