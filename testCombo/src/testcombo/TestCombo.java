package testcombo;

import javax.swing.*;


public class TestCombo {

    private static JOptionPane jop1, jop2, jop3;
    
    public static void main(String[] args) {
        Fenetre maFenetre = new Fenetre();
        
        jop1 = new JOptionPane();
        jop1.showMessageDialog(null,"Message de merde","Info",JOptionPane.INFORMATION_MESSAGE);
        
        jop2 = new JOptionPane();
        jop2.showMessageDialog(null,"Message de caca","Info",JOptionPane.WARNING_MESSAGE);
        
        jop3 = new JOptionPane();
        jop3.showMessageDialog(null,"Message de Sevim","Info",JOptionPane.ERROR_MESSAGE);
    }
    
}
