package converter;

import java.awt.*;
import javax.swing.*;

public class Fenetre extends JFrame {

    private JTextField input = new JTextField(20);
    private JRadioButton toDollars = new JRadioButton("-> USD");
    private JRadioButton toFrancs = new JRadioButton("-> CHF");
    private JTextField result = new JTextField();
    private JPanel container = new JPanel();
    private JButton calcul = new JButton("CALCULER");

    JPanel grid = new JPanel(new GridLayout(1, 2));

    public Fenetre() {

        this.setTitle("converter");
        this.setSize(400, 125);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        Box box1 = Box.createHorizontalBox();
        box1.add(input);

        Box box2 = Box.createHorizontalBox();
        box2.add(toDollars);
        box2.add(toFrancs);

        Box box3 = Box.createHorizontalBox();
        box3.add(result);
        
        Box box4 = Box.createHorizontalBox();
        box4.add(calcul);

        Box boxTOT = Box.createVerticalBox();
        boxTOT.add(box1);
        boxTOT.add(box2);
        boxTOT.add(box3);
        boxTOT.add(box4);

        container.add(boxTOT);

        this.setContentPane(container);
        this.setVisible(true);
    }

}
