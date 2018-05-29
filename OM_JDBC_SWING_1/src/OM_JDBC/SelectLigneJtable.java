/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OM_JDBC;


import static OM_JDBC.GestionTable.jTable1;
import static OM_JDBC.GestionTable.jTextField1_Nom;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zaura
 */
public class SelectLigneJtable {
    
    
    private int idSousCategorieSLget;
    
    public boolean selectionnerLigne () {    
//    public void selectionnerLigne (int idSousCategorie, String nomSousCategorie) {
        //int idSousCategorieSL;
        String nomSousCategorie;
        // OMDB 13.03.2018 : Sélectionner une ligne dans le SWING CONTROL TABLE
        int no_ligne_selectionnee = jTable1.getSelectedRow();
        // OMDB 13.03.2018 : Remplir le champ avec la valeur de la cellule sélectionnée
        DefaultTableModel tm = (DefaultTableModel)jTable1.getModel();
        idSousCategorieSLget = (int) tm.getValueAt(no_ligne_selectionnee, 0);

        nomSousCategorie = tm.getValueAt(no_ligne_selectionnee, 1).toString();
        jTextField1_Nom.setText(nomSousCategorie); 
        jTextField1_Nom.requestFocus();
        return true;
    }
    // Retourne le nombre d'habitants

    public int getDataId()
    {
        return this.idSousCategorieSLget;
    }
    
    public void setDataId(int idSousCat) {
      idSousCategorieSLget = idSousCat;
    }
}
