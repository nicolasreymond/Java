package testbuttonreacttest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fenetre extends JFrame {

    private JPanel container = new JPanel();
    private JPanel panel = new JPanel();
    private JLabel label = new JLabel("HELLO :)");

    private JButton b1 = new JButton("1");
    private JButton b2 = new JButton("2");

    private Font police = new Font("verdana", Font.BOLD, 30);

    public Fenetre() {
        this.setTitle("Bouton qui change la couleur");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        container.setLayout(new BorderLayout());
        container.add(panel, BorderLayout.CENTER);

        b1.addActionListener(new B1Listener());
        b2.addActionListener(new B2Listener());

        label.setFont(police);
        label.setForeground(Color.red);
        label.setHorizontalAlignment(JLabel.CENTER);
        container.add(label, BorderLayout.NORTH);

        panel.add(b1);
        panel.add(b2);
        container.add(panel, BorderLayout.SOUTH);

        this.setContentPane(container);
        this.setVisible(true);
    }

    class B1Listener implements ActionListener {

        public void actionPerformed(ActionEvent arg0) {
            label.setText("1");
            label.setForeground(Color.yellow);
        }
    }

    class B2Listener implements ActionListener {

        public void actionPerformed(ActionEvent arg0) {
            label.setText("2");
            label.setForeground(Color.blue);
        }
    }
}
