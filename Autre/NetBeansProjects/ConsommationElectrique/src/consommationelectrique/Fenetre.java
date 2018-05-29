package consommationelectrique;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Box;
import javax.swing.JOptionPane;


public class Fenetre extends JFrame{
    
    // Liste déroulante Appareil
    private String[] items = {"Veuillez choisir...","Radio-réveil","Aspirateur"};
    private JComboBox appareil = new JComboBox(items);
    
    // Saisie nombre d'heures
    private JTextField nbHeures = new JTextField();
    
    // Choix de la monnaie
    private JRadioButton Euro = new JRadioButton("Euros");
    private JRadioButton CHF = new JRadioButton("CHF");
    private JRadioButton Dollars = new JRadioButton("Dollars");
    // Une erreur est constatée
    // Erreur résolue: majuscule à Button
    
    // Affichage prix
    private JTextField layout = new JTextField();
    private String textLayout = "";
    private double kWh = 0;
    private double watts =0;
    private double prix = 0;
    
    // Boutons CALCULER et EFFACER
    private JButton calculer = new JButton("CALCULER");
    private JButton effacer = new JButton("EFFACER");
    
    //Conteneur des objets de la fenêtre
    private JPanel container = new JPanel();
    
    //Popup
    JOptionPane popup = new JOptionPane();
    
    public Fenetre(){
        
        // Paramètres de la fenêtre
        this.setTitle("Calcul de la consommation de vos appareils"); // Titre de la fenêtre
        this.setSize(480, 250); // Taille de la fenêtre en (x,y)
        this.setLocationRelativeTo(null); // La fenêtre apparaît au milieu de l'écran
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Action à la fermeture de la fenêtre
        this.setResizable(false); // Possibilité de redimensionner la fenêtre
        
        // Selecteur d'appareil (liste déroulante)
        Box bAppareil = Box.createVerticalBox(); // Crée un espace pour la liste déroulante
        bAppareil.add(appareil); // Met la liste déroulante dans l'espace
        bAppareil.add(new JLabel(" ")); // Ajoute un label vide pour un affichage plus aéré
        
        // Champ texte nb d'heures
        Box bHeures = Box.createVerticalBox(); // Crée espace
        JLabel tHeures = new JLabel("Combien d'heures votre appareil est-il allumé ?"); // Crée un label
        bHeures.add(tHeures); // Ajoute le label tHeures en haut
        bHeures.add(nbHeures); // Ajoute le champ texte
        bHeures.add(new JLabel(" ")); // Ajoute un label vide en bas
        
        // Selecteur monnaie (case à cocher)
        Box bMonnaie = Box.createHorizontalBox(); // Crée espace
        Euro.addActionListener(new bEuroListener()); // Ajoute une écoute sur le bouton (nécessite la création d'une classe)
        Euro.setSelected(true); // sélectionné par défaut
        bMonnaie.add(Euro); // Ajoute le bouton dans l'espace
        CHF.addActionListener(new bCHFListener());
        bMonnaie.add(CHF);
        Dollars.addActionListener(new bDollarsListener());
        bMonnaie.add(Dollars); // Pareil pour les autres
        bMonnaie.add(new JLabel(" ")); // Ajoute un label vide en dessous
        
        // Champ texte avec valeurs calculées
        Box bCalcul = Box.createVerticalBox(); // Crée espace
        JLabel tConso = new JLabel("Votre consommation d'énergie :"); // Crée un label
        bCalcul.add(tConso); // Ajoute le label tConso en haut
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
        bNorth.add(bAppareil); // ajoute les champs dans l'ordre
        bNorth.add(bHeures);
        bNorth.add(bMonnaie);
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
            if (appareil.getSelectedIndex()==0){
                popup.showMessageDialog(null, "Veuillez choisir un appareil !", "MESSAGE", JOptionPane.INFORMATION_MESSAGE);
            }
            
            // Récupération du nombre d'heures pour lancer le calcul
            try{ // try test si l'exécution est possible si c'est pas le cas il exécute catch. Pour éviter crash
                // Récupération d'une valeur au lieu d'une chaine
                Double vHeures = new Double(nbHeures.getText());
                
                // Assigner une consommation pour chaque appareil
                if (appareil.getSelectedIndex() == 1){
                    watts = 10;
                }else{
                    watts = 2000;
                }
                
                // Calculer kWh
                kWh = vHeures * watts / 1000;
                
                // Selecteur de monnaie
                if(Euro.isSelected()== true){
                    prix = kWh * 0.25 * 0.90501;
                    textLayout = "Vous avez consommé " + kWh + " kWh qui vous coûtent " + prix + " Euros"; // Affichage du résultat
                }else if (CHF.isSelected()== true){
                    prix = kWh * 0.25;
                    textLayout = "Vous avez consommé " + kWh + " kWh qui vous coûtent " + prix + " CHF"; // Affichage du résultat
                }else{
                    prix = kWh * 0.25 * 1.00751;
                    textLayout = "Vous avez consommé " + kWh + " kWh qui vous coûtent " + prix + " Dollars"; // Affichage du résultat
                }
                layout.setText(textLayout);
            }catch (NumberFormatException exception){
                popup.showMessageDialog(null,"Veuillez saisir correctement le nombre d'heures !", "ERREUR", JOptionPane.ERROR_MESSAGE);
            }
            if (prix > 10000){
                popup.showMessageDialog(null,"Vous devriez éteindre vos appareils !", "MESSAGE", JOptionPane.WARNING_MESSAGE);
            }
        }    
    }

    class bEffacerListener implements ActionListener {
        /*public void bActionListener(ActionEvent e) {
            //RESET
            appareil.setSelectedIndex(0);
            nbHeures.setText(" ");
            Euro.setSelected(true);
            CHF.setSelected(false);
            Dollars.setSelected(true);
            layout.setText(" ");
        }*/

        //@Override
        public void actionPerformed(ActionEvent e) {
            //RESET
            appareil.setSelectedIndex(0);
            nbHeures.setText(" ");
            Euro.setSelected(true);
            CHF.setSelected(false);
            Dollars.setSelected(true);
            layout.setText(" ");
        }
    }

    class bEuroListener implements ActionListener {
        /*public void ActionPerformed(ActionEvent e) {
            CHF.setSelected(false);
            Dollars.setSelected(false);
        }*/

        //@Override
        public void actionPerformed(ActionEvent e) {
            CHF.setSelected(false);
            Dollars.setSelected(false);
        }
    }

    class bCHFListener implements ActionListener {

        /*public void ActionPerformed(ActionEvent e) {
            Euro.setSelected(false);
            Dollars.setSelected(false);
        }*/

        //@Override
        public void actionPerformed(ActionEvent e) {
            Euro.setSelected(false);
            Dollars.setSelected(false);
        }
    }

    class bDollarsListener implements ActionListener {

        /*public void ActionPerformed(ActionEvent e) {
            Euro.setSelected(false);
            CHF.setSelected(false);
        }*/

        //@Override
        public void actionPerformed(ActionEvent e) {
            Euro.setSelected(false);
            CHF.setSelected(false);
        }
    }
}
