package clickerjava;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Fenetre extends JFrame {

    private static JOptionPane jop1, jop2;

    private int x = 1;
    private JPanel container = new JPanel();
    private JButton b1 = new JButton("SET");
    private JButton b2 = new JButton("RESET");
    private Font police = new Font("verdana", Font.BOLD, 30);

    private JLabel label = new JLabel("Vous n'avez jamais cliqué ;-)");

    public Fenetre() {
        this.setTitle("Clicker Java");
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        container.setBackground(Color.white);
        container.setLayout(new BorderLayout());

        label.setFont(police);
        label.setForeground(Color.black);

        JPanel top = new JPanel();
        top.add(label);

        container.add(top, BorderLayout.NORTH);

        JPanel bottom = new JPanel();

        bottom.add(b1);
        b1.addActionListener(new Bouton1Listener());

        bottom.add(b2);
        b2.addActionListener(new Bouton2Listener());

        container.add(bottom, BorderLayout.SOUTH);

        this.setContentPane(container);
        this.setVisible(true);
    }

    class Bouton1Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            label.setText("Vous avez cliqué " + (x++) + " fois");
        }
    }

    class Bouton2Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            label.setText("Vous n'avez jamais cliqué ;-)");

            if (x != 1) {
                jop1 = new JOptionPane();
                jop1.showMessageDialog(null, "Le compteur à été REINISIALLISER !!", "Info", JOptionPane.INFORMATION_MESSAGE);
            }else if (x == 1) {
                jop2 = new JOptionPane();
                jop2.showMessageDialog(null, "Le compteur est  déjà a 0 !!", "Info", JOptionPane.ERROR_MESSAGE);
            }

            x = 1;

        }
    }
}
