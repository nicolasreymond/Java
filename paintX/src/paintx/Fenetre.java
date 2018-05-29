/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintx;

import java.awt.*;
import static java.awt.Color.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author nreymond
 */
class Fenetre extends JFrame {

    int o;
    int i;
    private Panneau monPanneau = new Panneau(false);
    private JPanel container = new JPanel();
    private JButton b1 = new JButton("Couleur font");
    private JButton b2 = new JButton("Couleur trait");
    public final Color[] couleur = {RED, YELLOW, BLUE, GREEN, GRAY, PINK, MAGENTA, WHITE, BLACK};

    public Fenetre() {

        this.setTitle("zuzu");
        this.setSize(1000, 500);
        this.setLocationRelativeTo(this);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(container);
        container.setBackground(WHITE);

        this.setLayout(new BorderLayout());
        this.add(b1, BorderLayout.NORTH);
        b1.addActionListener(new Bouton1Listener());
        this.add(b2, BorderLayout.SOUTH);
        b2.addActionListener(new Bouton2Listener());
        this.add(monPanneau);
        this.setVisible(true);

    }

    class Bouton1Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            container.setBackground(couleur[i]);
            i++;
            if (i == 9) {
                i = 0;
            }
        }
    }

    class Bouton2Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            monPanneau.revalidate();
            Panneau monPanneau = new Panneau(true);
            monPanneau.repaint();

        }
    }
}
