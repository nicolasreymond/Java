package ex2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fenetre extends JFrame {

    private JPanel container = new JPanel();
    private JLabel l1 = new JLabel();
    private JLabel l2 = new JLabel();
    private JLabel l3 = new JLabel();
    private JTextField t1 = new JTextField();
    private JTextField t2 = new JTextField();
    private JTextField t3 = new JTextField();
    private JButton b1 = new JButton("SET");
    private JButton b2 = new JButton("SET");

    public Fenetre() {
        this.setTitle("Formulaire");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(2, 2));

        JButton b1 = new JButton("ROUGE");
        panel1.add(b1);

        JButton b2 = new JButton("VERT");
        panel1.add(b2);
        
        

        this.setContentPane(container);
        this.setVisible(true);
    }
}

