package frequenceCardiaque;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Fenetre extends JFrame {

    // Liste déroulante sexe
    private String[] items = {"Veuillez choisir...", "HOMME", "FEMME"};
    private JComboBox sexe = new JComboBox(items);

    // Saisie ageBox
    private JTextField ageBox = new JTextField();

    // Choix du profil sportif
    private JRadioButton PertePoids = new JRadioButton("Perte de poids");
    private JRadioButton Endurance = new JRadioButton("Endurance");
    private JRadioButton Performance = new JRadioButton("Performance");
    // Une erreur est constatée
    // Erreur résolue: majuscule à Button

    // Affichage pulse
    private JTextField layout = new JTextField();
    private String textLayout = "";
    private double rep1 = 0;
    private double rep2 = 0;

    // Boutons CALCULER et EFFACER
    private JButton calculer = new JButton("CALCULER");
    private JButton effacer = new JButton("EFFACER");

    //Conteneur des objets de la fenêtre
    private JPanel container = new JPanel();

    //Popup
    JOptionPane popup = new JOptionPane();

    public Fenetre() {

        // Paramètres de la fenêtre
        this.setTitle("Calcule de la Fréquence Cardiaque Optimal"); // Titre de la fenêtre
        this.setSize(550, 250); // Taille de la fenêtre en (x,y)
        this.setLocationRelativeTo(null); // La fenêtre apparaît au milieu de l'écran
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Action à la fermeture de la fenêtre
        this.setResizable(false); // Possibilité de redimensionner la fenêtre

        // Selecteur d'appareil (liste déroulante)
        Box bsexe = Box.createVerticalBox(); // Crée un espace pour la liste déroulante
        bsexe.add(sexe); // Met la liste déroulante dans l'espace
        bsexe.add(new JLabel(" ")); // Ajoute un label vide pour un affichage plus aéré

        // Champ texte ageBox
        Box bAge = Box.createVerticalBox(); // Crée espace
        JLabel tHeures = new JLabel("Spécifier votre âge"); // Crée un label
        bAge.add(tHeures); // Ajoute le label tHeures en haut
        bAge.add(ageBox); // Ajoute le champ texte
        bAge.add(new JLabel(" ")); // Ajoute un label vide en bas

        // Selecteur profil sportif (case à cocher)
        Box bProfilSportif = Box.createHorizontalBox(); // Crée espace
        PertePoids.addActionListener(new bPertePoidsListener()); // Ajoute une écoute sur le bouton (nécessite la création d'une classe)
        PertePoids.setSelected(true); // sélectionné par défaut
        bProfilSportif.add(PertePoids); // Ajoute le bouton dans l'espace
        Endurance.addActionListener(new bEnduranceListener());
        bProfilSportif.add(Endurance);
        Performance.addActionListener(new bPerformanceListener());
        bProfilSportif.add(Performance); // Pareil pour les autres
        bProfilSportif.add(new JLabel(" ")); // Ajoute un label vide en dessous

        // Champ texte avec valeurs calculées
        Box bCalcul = Box.createVerticalBox(); // Crée espace
        JLabel tPulse = new JLabel("Votre Fréquence Cardiaque conseillée :"); // Crée un label
        bCalcul.add(tPulse); // Ajoute le label tPulse en haut
        bCalcul.add(layout); // Ajoute le champ
        bCalcul.add(new JLabel(" ")); // Ajoute un label vide en dessous

        JPanel panSud = new JPanel(); // Crée un nouveau panel pour y mettre les boutons
        // Boutons CALCULER et EFFACER
        calculer.addActionListener(new bCalculerListener()); // Met une écoute sur le bouton calculer (nécessite la création d'une class)
        panSud.add(calculer); // Ajoute le bouton au panel
        effacer.addActionListener(new bEffacerListener()); // pareil
        panSud.add(effacer);

        // Boxes NORTH
        Box bNorth = Box.createVerticalBox(); // Crée un espace au nord pour y mettre les champs (box)
        bNorth.add(bsexe); // ajoute les champs dans l'ordre
        bNorth.add(bAge);
        bNorth.add(bProfilSportif);
        bNorth.add(bCalcul);
        bNorth.add(new JLabel(" ")); // ajoute un label vide à la fin
        container.add(bNorth, BorderLayout.NORTH); // met cet espace au nord container

        // SUD
        container.add(panSud, BorderLayout.SOUTH); // Ajoute le panel sud au sud du container
        this.setContentPane(container); // Affiche le container
        this.setVisible(true); // Rend la fenêtre visible
        go(); // sort de la fonction

    }

    private void go() {
        // Pas de redéfinition nécessaire
    }

    class bCalculerListener implements ActionListener { // Pour faire fonctionner le bouton calcul

        public void actionPerformed(ActionEvent e) {
            // Tester si un appareil a été sélectionner
            if (sexe.getSelectedIndex() == 0) {
                popup.showMessageDialog(null, "Veuillez choisir un sexe !", "MESSAGE", JOptionPane.INFORMATION_MESSAGE);
            }

            // Récupération du nombre d'heures pour lancer le calcul
            try {
                // try test si l'exécution est possible si c'est pas le cas il exécute catch. Pour éviter crash
                // Récupération d'une valeur au lieu d'une chaine
                final boolean etreHomme = sexe.getSelectedIndex() == 1;
                final int age = Integer.parseInt(ageBox.getText());
                final String but = PertePoids.isSelected() ? "PertePoids" : Endurance.isSelected() ? "Endurance" : "Performance";

                double[] fc;
                fc = FormuleFC.calculeFC(etreHomme, age, but);
                textLayout = "Entre " + fc[0] + " et " + fc[1] + " battements par minute"; // Affichage du résultat

                layout.setText(textLayout);
            } catch (NumberFormatException exception) {
                popup.showMessageDialog(null, "Veuillez saisir correctement l'âge !", "ERREUR", JOptionPane.ERROR_MESSAGE);
            }
        }

    }

    class bEffacerListener implements ActionListener {

        //@Override
        public void actionPerformed(ActionEvent e) {
            //RESET
            sexe.setSelectedIndex(0);
            ageBox.setText("");
            PertePoids.setSelected(true);
            Endurance.setSelected(false);
            Performance.setSelected(false);
            layout.setText(" ");
        }
    }

    class bPertePoidsListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Endurance.setSelected(false);
            Performance.setSelected(false);
        }
    }

    class bEnduranceListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            PertePoids.setSelected(false);
            Performance.setSelected(false);
        }
    }

    class bPerformanceListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            PertePoids.setSelected(false);
            Endurance.setSelected(false);
        }
    }
}
