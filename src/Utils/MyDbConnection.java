/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author gogo-
 */
public class MyDbConnection {

    private static MyDbConnection instance;

    public static PreparedStatement prepareStatement(String requete) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private Connection connexion;
    private String url = "JDBC:mysql://localhost:3306/jardinenfant";
    private String user = "root";
    private String password = "";

    private MyDbConnection() {
        try {
            connexion = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            System.out.println("Probleme de connexion");
        }
    }

    public static MyDbConnection getInstance() {
        if (MyDbConnection.instance == null) {
            MyDbConnection.instance = new MyDbConnection();
        }
        return MyDbConnection.instance;
    }

    public Connection getConnexion() {
        return this.connexion;
    }

    public Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

