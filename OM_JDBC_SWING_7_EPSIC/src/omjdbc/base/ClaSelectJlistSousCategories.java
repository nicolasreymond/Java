/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package omjdbc.base;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


/**
 *
 * @author zaurak
 */
public class ClaSelectJlistSousCategories extends javax.swing.JFrame {
    private List<String> selectedValuesSousCategories;
    private ClaConnectionBd oConnection = new ClaConnectionBd();

    private static int idLibProbReceiveSelectJlist;
   
    /**
     * Creates new form essaiJList
     */
    public ClaSelectJlistSousCategories() {
        
            initComponents();
            // OMDB 13.04.2018 : Initialisation des messages d'information.
            jTextArea1SCselected.setText("");
            jLabel3MessageSaveSc.setText("");
            /* OMDB 13.04.2018 : Il ne faut pas que l'utilisateur sélectionne une sauvegarde en BD,
            alors que rien n'est sélectionné dans la liste des sous catégories.
            on désactive le bouton "jButton1SaveLibSc"
            */
            jButton1SaveLibSc.setEnabled(false);
            
            setidLibProbReceiveSelectJlist(getidLibProbReceiveSelectJlist());

            // OMDB 13.03.2018 : On insére les valeurs de la base de donnée dans la "jList1SousCategories"
            remplir_liste_sous_categories();

    }

    public ClaSelectJlistSousCategories(int idLibelleRecu) {
        /* OMDB 28.04.2018 : Pour passer l'id du libellé qui se trouve sélectionné dans la fenêtre PARENT 
            dans ClaGestionLibellesCatSousCat par l'event jButton1AjouterCategorieActionPerformed
        */
            setidLibProbReceiveSelectJlist(idLibelleRecu);
			// OMDB 28.04.2018 : juste pour imprimer dans la console....														
            System.out.println("idLibelleRecu " + getidLibProbReceiveSelectJlist());

    }
	
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1SousCategories = new javax.swing.JList<>();
        jButton1SaveLibSc = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1SCselected = new javax.swing.JTextArea();
        jLabel3MessageSaveSc = new javax.swing.JLabel();
        jButton1Fermer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jList1SousCategories.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1SousCategories.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1SousCategoriesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1SousCategories);

        jButton1SaveLibSc.setText("Save to DB / FERMER");
        jButton1SaveLibSc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1SaveLibScActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Sous catégories sélectionnées");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Sous catégories");

        jTextArea1SCselected.setColumns(20);
        jTextArea1SCselected.setRows(5);
        jScrollPane2.setViewportView(jTextArea1SCselected);

        jLabel3MessageSaveSc.setText("MessageSaveSc");

        jButton1Fermer.setText("ANNULER / FERMER");
        jButton1Fermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1FermerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1SaveLibSc)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3MessageSaveSc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1Fermer)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1SaveLibSc)
                            .addComponent(jLabel3MessageSaveSc)
                            .addComponent(jButton1Fermer))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jList1SousCategoriesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1SousCategoriesValueChanged
        // TODO add your handling code here:
        /* OMDB 13.04.2018 : Efface l'éventuel message(insertion ok ou pas d'insertion)
         ... car l'utilisateur vient de cliquer su une sous catégorie 
        */
        jLabel3MessageSaveSc.setText("");
        jButton1SaveLibSc.setEnabled(true);

        if(!evt.getValueIsAdjusting()) {
            selectedValuesSousCategories = (List<String>) jList1SousCategories.getSelectedValuesList();
            // OMDB 13.04.2018 : Affiche dans une fenêtre jTextArea1SCselected les sous catégories sélectionnées
            String chaineselectedValuesSousCategories = String.join("\n", selectedValuesSousCategories);
            jTextArea1SCselected.setText(chaineselectedValuesSousCategories);
																													
            jTextArea1SCselected.setEditable(false);
        } else {
        
        }

       
    }//GEN-LAST:event_jList1SousCategoriesValueChanged

    private void jButton1SaveLibScActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1SaveLibScActionPerformed
        // TODO add your handling code here:
        insererLibelleSousCategorieBD();
    }//GEN-LAST:event_jButton1SaveLibScActionPerformed

    private void jButton1FermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1FermerActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1FermerActionPerformed

    

public final int getidLibProbReceiveSelectJlist ()
{
    /*  OMDB 28.04.2018 : Retourne l'id du libellé (situé dans la fenêtre PARENT dans ClaGestionLibellesCatSousCat 
        ici joue le rôle de GETTER
    */									
    return idLibProbReceiveSelectJlist;
}

public final void setidLibProbReceiveSelectJlist (int idLib)
{
    /*  OMDB 28.04.2018 : Pour accèder à la variable private idLibProbReceiveSelectJlist, joue le rôle de SETTER 
        variable qui indique l'id du libellé problème
    */										 
    idLibProbReceiveSelectJlist = idLib;
}
    

private boolean remplir_liste_sous_categories() {
        
        // OMDB 13.03.2018 : Requête pour remplir la JLIST
        String sql_select_sc = "SELECT Id_Sous_Categorie, Nom_Sous_Categorie COLLATE utf8_unicode_ci as Nom_Sous_Categorie  FROM t_sous_categorie ORDER BY Nom_Sous_Categorie COLLATE utf8_unicode_ci ASC";

        try{
            
            // OMDB 13.03.2018 : "préparer" la requête (ici sans paramètres) pour la BD.
            PreparedStatement pst = ClaConnectionBd.getConnection().prepareStatement(sql_select_sc);
            // OMDB 13.03.2018 : Permet d'afficher des données dans un modèle de liste qu'il est possible de personnaliser.
            DefaultListModel defListModel = new DefaultListModel();
            jList1SousCategories.setModel(defListModel);
            // OMDB 13.03.2018 : Envoyer la requête à la BD
            ResultSet rs = pst.executeQuery();

            // OMDB 13.03.2018 : Parcourir toutes les lignes de la table
            while(rs.next())
            {
                String nomSousCategorie = rs.getString("Nom_Sous_Categorie");
                // OMDB 04.04.2018 : ajoute dans le SWING CONTROL JLIST une ligne de donnée
                defListModel.addElement(nomSousCategorie);
            }
            /* OMDB 09.04.2018 : ON DOIT FERMER LA CONNECTION A LA BD. 
                AINSI PAS DE PROBLEMES LIES A LA MULTIPLICATION DES SESSIONS DE L'UTILISATEUR "root"
            */
            oConnection.closeConnection();
            // OMDB 13.03.2018 : C'est une fonction. Tout s'est bien déroulé ...donc on lui assigne la valeur TRUE
            return true;
        }
        catch(Exception e){
            // OMDB 13.03.2018 : Avertir l'utilisateur d'un sacré problème d'accès aux tables... héhé !!!
            JOptionPane.showMessageDialog(null, "Connection à la BD OK ! \nProblème avec l'accès aux tables de la BD !");
            // OMDB 13.03.2018 : Imprime les erreurs pour pouvoir debugger
            e.printStackTrace();
            // OMDB 13.03.2018 : QUITTE L'APPLICATION
            System.exit(0);
            return false;
        }
    }    

    public boolean insererLibelleSousCategorieBD() {
    /*
        OMDB 28.04.2018 : Pour insèrer une nouvelle sous catégories affectée à un libellé
    */
        // OMDB 28.04.2018 : Quelques variables qui sont liées à la sélection des valeurs dans une JLIST 	  
        int NbDblSc = 0;
        int[] selectedIdx;
        selectedIdx = jList1SousCategories.getSelectedIndices();

        // OMDB 13.03.2018 : Reqûête pour trouver d'éventuels doublons lors de la sélection dans la liste,
        // l'utilisateur n'a pas à se soucier s'il sélectionne un mot déjà présent dans la BD

        String sql_CompterDoublonsSousCatLibelle = "SELECT count(*) AS NbDblSc  FROM t_libelles_souscat WHERE fk_libelle = ? AND fk_sous_categorie = ( SELECT Id_Sous_Categorie FROM t_sous_categorie WHERE Nom_Sous_Categorie COLLATE utf8_unicode_ci LIKE ?)";
        
        // OMDB 28.04.2018 : On insère dans la table intermédiaire "t_libelles_souscat" la ligne qui indique la correspondance entre le libellé et la sous catégorie.         
        String sql_RechercheIdSousCategorieInsFkSousCat = "INSERT INTO t_libelles_souscat (id_Libelle_SousCat, fk_libelle, fk_sous_categorie, Date_Libelle_SousCat)\n"+
" VALUES (NULL, ?,( SELECT Id_Sous_Categorie FROM t_sous_categorie WHERE Nom_Sous_Categorie COLLATE utf8_unicode_ci LIKE ?), CURRENT_TIMESTAMP)";


        try{
            // OMDB 28.04.2018 : L'utilisateur à cliqué sur le bouton d'ajout et il n'a rien sélectionné. Affiche un message d'erreur																				
            if (selectedIdx.length == 0) {
                // OMDB 13.04.2018 : Avertir l'utilisateur qu'il n'a rien sélectonné
                jLabel3MessageSaveSc.setText("Pas de sélection");
                /* OMDB 13.04.2018 : Il ne faut pas que l'utilisateur sélectionne une sauvegarde en BD, 
                    alors que rien n'est sélectionné dans la liste des sous catégories.
                    on désactive le bouton "jButton1SaveLibSc"
                */
                jButton1SaveLibSc.setEnabled(false);                
                
            } else {

                for (int i = 0; i < selectedIdx.length; i++) {
																			
                    Object nomSousCategorie = jList1SousCategories.getModel().getElementAt(selectedIdx[i]);

                    // OMDB 13.03.2018 : "préparer" la requête (ici avec un paramètre) pour la BD.
                    PreparedStatement pstRechIdSc = ClaConnectionBd.getConnection().prepareStatement(sql_RechercheIdSousCategorieInsFkSousCat);
                    // OMDB 13.03.2018 : Passer la valeur au paramètre (défini par ?) dans la requête "sql_RechercheIdSousCategorieInsFkSousCat"
                    pstRechIdSc.setInt(1,getidLibProbReceiveSelectJlist());
                    // OMDB 13.03.2018 : Passer la valeur au paramètre (défini par ?) dans la requête "sql_RechercheIdSousCategorieInsFkSousCat"
                    pstRechIdSc.setString(2, (String) nomSousCategorie);
                    // OMDB 13.03.2018 : "préparer" la requête (ici sans paramètres) pour la BD.
                    PreparedStatement pstCptDoublSousCat = ClaConnectionBd.getConnection().prepareStatement(sql_CompterDoublonsSousCatLibelle);
                    // OMDB 13.03.2018 : Passer la valeur au paramètre (défini par ?) dans la requête "sql_RechercheIdSousCategorieInsFkSousCat"
                    pstCptDoublSousCat.setInt(1, getidLibProbReceiveSelectJlist());                    
                    // OMDB 13.03.2018 : Passer la valeur au paramètre (défini par ?) dans la requête "sql_RechercheIdSousCategorieInsFkSousCat"
                    pstCptDoublSousCat.setString(2, (String) nomSousCategorie);                    
                    // OMDB 13.03.2018 : Envoyer la requête à la BD
                    ResultSet rsCptDoublSousCat = pstCptDoublSousCat.executeQuery();
                    //rsCptDoublSousCat.beforeFirst();
                    while(rsCptDoublSousCat.next())
                    {
                        NbDblSc = rsCptDoublSousCat.getInt("NbDblSc");
                    } 
                    
                    // OMDB 28.04.2018 : On ne doit pas insèrer des doublons de catégories
                    if (NbDblSc > 0) {
                        
                        jTextArea1SCselected.setText("");
                        /* OMDB 13.04.2018 : Avertir l'utilisateur que l'insertion des sous catégories à des doublons
                            il doit resélectionner
                        */
                        jButton1SaveLibSc.setEnabled(true);
                        // OMDB 30.04.2018 : Rend invisible la fenêtre actuelle. 
                        this.setVisible(false);
                        jLabel3MessageSaveSc.setText("DOUBLONS");
                        JOptionPane.showMessageDialog(null, "PAS D'INSERTION, DOUBLONS");

                        jLabel3MessageSaveSc.setText("");                        
                    } else {
                        // OMDB 13.03.2018 : Envoyer la requête à la BD
                        pstRechIdSc.execute();
                        /* OMDB 13.04.2018 : Avertir l'utilisateur que l'insertion des sous catégories sélectionnées est OK
                            utilise une "messagedialog" qui est modale, donc elle empêche la sélection des autres fenêtres de l'application.
                            C'est pourquoi il n'est pas utile de désactiver le bouton "jButton1SaveLibSc"... mais je l'ai fait quand même...hihi
                        */
                        jButton1SaveLibSc.setEnabled(false);
                        // OMDB 30.04.2018 : Rend invisible la fenêtre actuelle. 
                        this.setVisible(false);
                        JOptionPane.showMessageDialog(null, "INSERTION OK");
                    }

                    /* OMDB 09.04.2018 : ON DOIT FERMER LA CONNECTION A LA BD. 
                        AINSI PAS DE PROBLEMES LIES A LA MULTIPLICATION DES SESSIONS DE L'UTILISATEUR "root"
                    */
                    oConnection.closeConnection();
                }
            }
            // OMDB 13.04.2018 : Ferme cette fenêtre   
            this.dispose();
            // OMDB 13.03.2018 : C'est une fonction. Tout s'est bien déroulé ...donc on lui assigne la valeur TRUE
            return true;
        }
        catch(Exception e){
            // OMDB 13.03.2018 : Avertir l'utilisateur d'un sacré problème d'accès aux tables... héhé !!!
            JOptionPane.showMessageDialog(null, "Connection à la BD OK ! \nProblème avec l'accès aux tables de la BD !");
            // OMDB 13.03.2018 : Imprime les erreurs pour pouvoir debugger
            e.printStackTrace();
            // OMDB 13.03.2018 : QUITTE L'APPLICATION
            System.exit(0);
            return false;
        }
    }



    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClaSelectJlistSousCategories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClaSelectJlistSousCategories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClaSelectJlistSousCategories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClaSelectJlistSousCategories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
						
					

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClaSelectJlistSousCategories().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Fermer;
    private javax.swing.JButton jButton1SaveLibSc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3MessageSaveSc;
    private javax.swing.JList<String> jList1SousCategories;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1SCselected;
    // End of variables declaration//GEN-END:variables
}
