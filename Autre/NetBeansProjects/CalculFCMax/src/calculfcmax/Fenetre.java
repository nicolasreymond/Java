package calculfcmax;

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
    
    // Liste déroulante SEXE
    private String[] items = {"Veuillez choisir...","Femme","Homme"};
    private JComboBox sexe = new JComboBox(items);
    
    // Saisie AGE
    private JTextField age = new JTextField();
    
    // Choix TYPE ACTIVITE
    private JRadioButton poids = new JRadioButton("Perte de poids");
    private JRadioButton endurance = new JRadioButton("Endurance");
    private JRadioButton performance = new JRadioButton("Performance");
    
    // Affichege FC optimale
    private JTextField fc = new JTextField();
    private String fcText = "";
    private int FCmax = 0;
    private int FC1 = 0;
    private int FC2 = 0;
    
    
    // Boutons CALCULER et EFFACER
    private JButton calculer = new JButton("CALCULER");
    private JButton effacer = new JButton("EFFACER");
    
    // Conteneur des objets de la fenêtre
    private JPanel container = new JPanel();
    
    // PopUp
    JOptionPane popup= new JOptionPane();
        
    
    public Fenetre(){
        
        this.setTitle("Calcul de la Fréquence Cardiaque optimale");
        this.setSize(480, 250);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        
        // Selecteur SEXE (liste déroulante)
        Box bSexe = Box.createVerticalBox();
        bSexe.add(sexe);
        bSexe.add(new JLabel(" "));
        
        // Champs texte AGE
        Box bAge = Box.createVerticalBox();
        JLabel tAge = new JLabel("Spécifier votre âge :");
        bAge.add(tAge);
        bAge.add(age);
        bAge.add(new JLabel(" "));
        
        // Selecteur TYPE ACTIVITE (case à cocher)
        Box bActivite = Box.createHorizontalBox();
        poids.addActionListener(new bPoidsListener());
        poids.setSelected(true);
        bActivite.add(poids);
        endurance.addActionListener(new bEnduranceListener());
        bActivite.add(endurance);
        performance.addActionListener(new bPerformanceListener());
        bActivite.add(performance);
        bActivite.add(new JLabel(" "));
        
        // Champ texte CALCUL FC
        Box bFC = Box.createVerticalBox();
        JLabel tFC = new JLabel("Votre Fréquence Cardiaque conseillée :");
        bFC.add(tFC);
        bFC.add(fc);
        bFC.add(new JLabel(" "));
        
         JPanel panSud = new JPanel();
        // Boutons CALCULER et EFFACER
        calculer.addActionListener(new bCalculerListener());
        panSud.add(calculer);
        effacer.addActionListener(new bEffacerListener());
        panSud.add(effacer);
        
        // Boxes NORTH
        Box bNorth = Box.createVerticalBox();
        bNorth.add(bSexe);
        bNorth.add(bAge);
        bNorth.add(bActivite);
        bNorth.add(new JLabel(" "));
        bNorth.add(bFC);
        container.add(bNorth, BorderLayout.NORTH);
        
              
        // SUD
        container.add(panSud, BorderLayout.SOUTH);
        
        this.setContentPane(container);
        
        this.setVisible(true);
        
        go();
    }
    
    private void go(){
        // Pas de redéfinition nécessaire
    }
    
    class bCalculerListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            // Tester si choix sexe OK
            if (sexe.getSelectedIndex()==0){
                popup.showMessageDialog(null,"Veuillez choisir votre sexe !", "MESSAGE", JOptionPane.INFORMATION_MESSAGE);
            }
            
            // Récupération de l'age pour lancer le calcul !!! Origine même d'un crash possible !!!
            try{
                // Récupération d'une valeur au lieu d'une chaine
                Integer vAge = new Integer(age.getText());
                
                // Pas de mesure avant 6 ans
                if (vAge < 6){
                    popup.showMessageDialog(null,"Age introduit n'est pas valide !", "MESSAGE", JOptionPane.INFORMATION_MESSAGE);
                }
                else {
            
                    if (vAge > 49){
                        popup.showMessageDialog(null,"Veuillez consulter votre médecin avant tout effort !", "MESSAGE", JOptionPane.INFORMATION_MESSAGE);
                    }
                       
                    // Assigner FCmax 226 pour Femme et FCmax 220 pour Homme
                    if (sexe.getSelectedIndex()== 1){
                        FCmax = 226;
                    }else{
                        FCmax = 220;
                    }
            
                    // Calculer FCmax
                    FCmax = FCmax-vAge;
            
                    // Selecteur de perfomance
                    if (poids.isSelected()== true){
                        // Si perte de poids
                        FC1 = FCmax*60/100;
                        FC2 = FCmax*70/100;
                    }else if (endurance.isSelected() == true)
                    {
                        // Si endurance
                        FC1 = FCmax*70/100;
                        FC2 = FCmax*80/100;
                    }else
                    {
                        // Si performance
                        FC1 = FCmax*80/100;
                        FC2 = FCmax*90/100;
                    }
            
                    // Affichage du résultat
                    fcText = "Entre " + FC1 + " et " + FC2 + " battements par minute.";
                    fc.setText(fcText);
                }
            }
            // Intercepte l'exception au cas où ce n'est pas une valeur, sinon crash de l'appli ;-)
            catch (NumberFormatException exception){
                // Erreur sur le champs texte
              popup.showMessageDialog(null,"Veuillez saisir correctement votre âge !", "ERREUR", JOptionPane.ERROR_MESSAGE);  
            }
        }
    }
    
    class bEffacerListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            // RESET
            sexe.setSelectedIndex(0);
            age.setText(" ");
            poids.setSelected(true);
            endurance.setSelected(false);
            performance.setSelected(false);
            fc.setText(" ");
        }
    }
    
    class bPoidsListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            endurance.setSelected(false);
            performance.setSelected(false);            
        }
    }
    
    class bEnduranceListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
             poids.setSelected(false);
             performance.setSelected(false);  
        }
    }
    
    class bPerformanceListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
             poids.setSelected(false);
             endurance.setSelected(false);
        }
    }
}
