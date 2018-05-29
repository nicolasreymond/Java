package exajava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenetre extends JFrame {

    //radiobuttons
    private JRadioButton CHFRad = new JRadioButton("CHF=>€");
    private JRadioButton EurosRad = new JRadioButton("€=>CHF");

    //textfields
    private JTextField CHFField = new JTextField();
    private JTextField EuroField = new JTextField();

    //labels
    private JLabel CHFLabel = new JLabel("CHF");
    private JLabel EuroLabel = new JLabel("€");

    //Boutons
    private Bouton calculer = new Bouton("CALCULER", Color.BLUE, Color.WHITE, new Font("Verdana", Font.BOLD, 10));
    private Bouton effacer = new Bouton("EFFACER", Color.BLACK, Color.WHITE, new Font("Verdana", Font.BOLD, 10));

    // Conteneur des objets de la fenêtre
    private JPanel container = new JPanel();

    // PopUp
    JOptionPane popup = new JOptionPane();

    //grid boutons
    JPanel grid = new JPanel(new GridLayout(1, 2));

    public Fenetre() {
        //Paramètres de la fenêtre
        this.setTitle("Convertisseur de monnaie");
        this.setSize(450, 100);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        //container
        this.setContentPane(container);
        container.setLayout(new BorderLayout());

        //Ligne du haut
        Box bHaut = Box.createHorizontalBox();
        bHaut.add(CHFLabel);
        bHaut.add(CHFField);
        bHaut.add(CHFRad);
        bHaut.add(EurosRad);
        bHaut.add(EuroField);
        bHaut.add(EuroLabel);

        //Ligne du bas
        /*Box bBas = Box.createHorizontalBox();
        bBas.add(calculer);
        bBas.add(effacer);*/
        grid.add(calculer);
        grid.add(effacer);
        calculer.addActionListener(new CalculListener());
        effacer.addActionListener(new ResetListener());

        //radio group
        ButtonGroup group = new ButtonGroup();
        group.add(CHFRad);
        group.add(EurosRad);
        CHFRad.setSelected(true);
        EurosRad.setSelected(false);
        EuroField.setEditable(false);
        CHFRad.addActionListener(new CHFListener());
        EurosRad.addActionListener(new EurosListener());

        //ajouts éléments au container
        container.add(bHaut, BorderLayout.NORTH);
        container.add(grid, BorderLayout.SOUTH);

        this.setVisible(true);
    }

    class CHFListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            EuroField.setEditable(false);
            CHFField.setEditable(true);
        }
    }

    class EurosListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            CHFField.setEditable(false);
            EuroField.setEditable(true);
        }
    }

    class CalculListener implements ActionListener {

        private boolean isTextValid(String inputMoney) {
            if (inputMoney == null || inputMoney.isEmpty()) {
                popup.showMessageDialog(null, "Enter a number", "WARNING", JOptionPane.WARNING_MESSAGE);
            } else if (!inputMoney.matches("[0-9]{1,13}(\\.[0-9]*)?")) {
                popup.showMessageDialog(null, "Something went wrong, sorry !", "ERREUR", JOptionPane.ERROR_MESSAGE);

            } else if (Double.parseDouble(inputMoney) < 0) {
                popup.showMessageDialog(null, "Come on dude, get some real money !", "WARNING", JOptionPane.WARNING_MESSAGE);
            } else {

                return true;
            }
            return false;
        }

        public void actionPerformed(ActionEvent e) {
            double Euros;
            double CHF;
            if (CHFRad.isSelected() == true) {
                if (isTextValid(CHFField.getText())) {
                    CHF = Double.parseDouble(CHFField.getText());
                    Euros = CHF / 1.1;
                    CHFField.setText(String.format("%.2f", CHF));
                    EuroField.setText(String.format("%.2f", Euros));
                }
            } else if (isTextValid(EuroField.getText())) {
                Euros = Double.parseDouble(EuroField.getText());
                CHF = Euros * 1.1;
                EuroField.setText(String.format("%.2f", Euros));
                CHFField.setText(String.format("%.2f", CHF));
            }

            /*          
            try {
                double Euros;
                double CHF;
                if (CHFRad.isSelected() == true) {
                    if (CHFField.getText() == null || CHFField.getText().isEmpty()) {
                        popup.showMessageDialog(null, "Enter a number", "WARNING", JOptionPane.WARNING_MESSAGE);
                    } else if (Double.parseDouble(CHFField.getText()) < 0) {
                        popup.showMessageDialog(null, "Come on dude, get some real money !", "WARNING", JOptionPane.WARNING_MESSAGE);
                    } else {
                        CHF = Double.parseDouble(CHFField.getText());
                        Euros = CHF / 1.1;
                        CHFField.setText(String.format("%.2f", CHF));
                        EuroField.setText(String.format("%.2f", Euros));
                    }
                } else if (EuroField.getText() == null || EuroField.getText().isEmpty()) {
                    popup.showMessageDialog(null, "Enter a number", "WARNING", JOptionPane.WARNING_MESSAGE);
                } else if (Double.parseDouble(EuroField.getText()) < 0) {
                    popup.showMessageDialog(null, "Come on dude, get some real money !", "WARNING", JOptionPane.WARNING_MESSAGE);
                } else {
                    Euros = Double.parseDouble(EuroField.getText());
                    CHF = Euros * 1.1;
                    EuroField.setText(String.format("%.2f", Euros));
                    CHFField.setText(String.format("%.2f", CHF));
                }
            } catch (NumberFormatException er) {
                popup.showMessageDialog(null, "Something went wrong, sorry !", "ERREUR", JOptionPane.ERROR_MESSAGE);
            }
             */
        }
    }

    class ResetListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            CHFField.setEditable(true);
            EuroField.setEditable(false);
            CHFRad.setSelected(true);
            EurosRad.setSelected(false);
            CHFField.setText("");
            EuroField.setText("");
        }
    }

}
