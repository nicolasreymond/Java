package exercice;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class Fenetre extends JFrame {

    private JLabel nord, sud;
    private JPanel container = new JPanel();
    private JButton buton = new JButton();

    public Fenetre() {
        this.setTitle("Miroir à texte"); //donner titre à la fenêtre
        this.setSize(800, 90); // donne une taille à la fenêtre
        this.setLocationRelativeTo(null); // apparaît au milieu de l'écran
        this.setResizable(false); // ne se redimensionne pas
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// s'arrête à la fermeture de la fenêtre

        container.setBackground(Color.black);
        container.setLayout(new BorderLayout());

        nord.setForeground(Color.blue);
        //sud.setForeground(Color.red);
        
        nord.add(buton);

        
        
        
        
        
        container.add(nord, BorderLayout.NORTH);
        container.add(sud, BorderLayout.SOUTH);

        this.setContentPane(container);
        this.setVisible(true);

    }
}
