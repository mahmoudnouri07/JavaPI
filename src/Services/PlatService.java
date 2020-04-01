/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Plats;
import Utils.MyDbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mahmoud ennouri
 */
public class PlatService {
    Connection m=MyDbConnection.getInstance().getConnection();
    
    public void AddPlat(Plats p) {

        String requete = "INSERT INTO plat(NomPlat, PhotoPlat, description, date) VALUES (?,?,?,?)";

        try {

            PreparedStatement st = MyDbConnection.prepareStatement(requete);
            
           
            st.setString(1, m.getNomPlat());
            st.setString(2, m.getPhotoPlat());
            st.setString(3, m.getdescription());
            st.setDate(4, m.getdate());
          

            st.executeUpdate();
            System.out.println("Plat ajouté");

        } catch (SQLException ex) {
            Logger.getLogger(PlatService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    

    
}