package OM_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConnectionBd {

    private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
    public static String myIP = "127.0.0.1:3307"; //WARNING !!! IF YOU USE DOCKER FOR YOUR DATABASE ENTER YOUR IP ADRESS ELSE ENTER "localhost"
    public static String myDB = "Film_Nicolas";
    private static final String chaineConnectDB = "jdbc:mysql://" + myIP + "/" + myDB;
    private static final String user = "root";
    private static final String password = "root";
    private static Connection conn;

    // OMDB 29.03.2018 : Méthode pour se connecter à la BD 
    public static Connection getConnection() {
        //Connection conn = null;        
        try {
            Class.forName(DRIVER_NAME);
            try {
                conn = DriverManager.getConnection(chaineConnectDB, user, password);
                return conn;
            } catch (SQLException ex) {
                Logger.getLogger(GestionTable.class.getName()).log(Level.SEVERE, null, ex);
                // OMDB 13.03.2018 : Problème de connection à la BD, affiche un message et ferme l'application !
                JOptionPane.showMessageDialog(null, "GROS PROBLEME DE CONECTION A LA BD...!!");
                System.exit(0);
                return null;
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("com.mysql.jdbc.Driver EST ABSENT ");
        }
        return conn;
    }

    public boolean closeConnection() throws SQLException {

        if (conn.isClosed()) {

        } else {
            conn.close();
        }
        return true;
    }
}
