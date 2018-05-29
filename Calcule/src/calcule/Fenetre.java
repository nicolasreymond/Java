package calcule;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Fenetre extends JFrame {

    private static JOptionPane jop1, jop2;

    private int x = 1;
    private JPanel container = new JPanel();
    private JButton b1 = new JButton("CALCULER");
    private JButton b2 = new JButton("RESET");
    private Font police = new Font("verdana", Font.BOLD, 30);
    private JComboBox cb1 = new JComboBox();
    private JRadioButton rb1 = new JRadioButton("Poid");
    private JRadioButton rb2 = new JRadioButton("Poid");
    private JRadioButton rb3 = new JRadioButton("Poid");

    public Fenetre() {
        this.setTitle("Calcul de la Frécance Cardiaque");
        this.setSize(500, 150);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel l1 = new JPanel();
        //l1.setLayout(new BoxLayout(container, BoxLayout.LINE_AXIS));
        cb1.addItem("Veuiller choisir...");
        cb1.addItem("Homme");
        cb1.addItem("Femme");
        cb1.setSize(100, 100);
        
        l1.add(container, BoxLayout.LINE_AXIS);
        
        JPanel l2 = new JPanel();
        l2.setLayout(new BoxLayout(container, BoxLayout.LINE_AXIS));

        JPanel l3 = new JPanel();
        l3.setLayout(new BoxLayout(container, BoxLayout.LINE_AXIS));

        container.setBackground(Color.white);
/*
        //container.add(centre, BorderLayout.CENTER);
        //container.setLayout(new BoxLayout(container, BoxLayout.LINE_AXIS));
        //JPanel top = new JPanel();

        
        //container.add(top, BorderLayout.NORTH);

        JPanel bottom = new JPanel();

        bottom.add(b1);
        b1.addActionListener(new Bouton1Listener());

        bottom.add(b2);
        b2.addActionListener(new Bouton2Listener());

        container.add(bottom, BorderLayout.SOUTH);*/

        this.setContentPane(container);
        this.setVisible(true);
    }

    class Bouton1Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
        }
    }

    class Bouton2Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            if (x != 1) {
                jop1 = new JOptionPane();
                jop1.showMessageDialog(null, "Le compteur à été REINISIALLISER !!", "Info", JOptionPane.INFORMATION_MESSAGE);
            }
            if (x == 1) {
                jop2 = new JOptionPane();
                jop2.showMessageDialog(null, "Le compteur est  déjà a 0 !!", "Info", JOptionPane.ERROR_MESSAGE);
            }

            x = 1;

        }
    }
}
