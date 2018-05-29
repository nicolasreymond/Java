/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package omjdbc.base;


import static omjdbc.base.ClaGestionGenre.jTable1_genres;
import static omjdbc.base.ClaGestionGenre.jTextField1_nom_genre;
import javax.swing.table.DefaultTableModel;

/**
 *
  * @author zaurak (OMDB) le 13.03.2018
 * MODIFICATIONS : CLOSE DB 17.04.2018
 * exemple pour nos apprentis informaticiens
 * aussi brillants que "zaurak"
 */
public class ClaSelectLigneJtable {
    
    
    private int idSousCategorieSLget;
    
    public boolean selectionnerLigne () {    

        String nomSousCategorie;
        // OMDB 13.03.2018 : Sélectionner une ligne dans le SWING CONTROL TABLE
        int no_ligne_selectionnee = jTable1_genres.getSelectedRow();
        // OMDB 13.03.2018 : Remplir le champ avec la valeur de la cellule sélectionnée
        DefaultTableModel tm = (DefaultTableModel)jTable1_genres.getModel();
        idSousCategorieSLget = (int) tm.getValueAt(no_ligne_selectionnee, 0);

        nomSousCategorie = tm.getValueAt(no_ligne_selectionnee, 1).toString();
        jTextField1_nom_genre.setText(nomSousCategorie); 
        jTextField1_nom_genre.requestFocus();
        return true;
    }

    public int getidSousCategorieSL()
    {
        return this.idSousCategorieSLget;
    }
    
    public void setidSousCategorieSL(int idSousCat) {
      idSousCategorieSLget = idSousCat;
    }
}
