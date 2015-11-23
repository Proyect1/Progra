/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progratransporte;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author miguel
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        conectar con;
/////puta la wea
   
        con=new conectar();
      try {
             PreparedStatement pstm = con.getConection().prepareStatement("select PATENTE from ROOT.BUS");
         ResultSet rs = pstm.executeQuery();
         while(rs.next()){
            
             System.out.println(rs.getString("PATENTE")); 
         }
         } catch (SQLException ex) {
             Logger.getLogger(FRMacceso.class.getName()).log(Level.SEVERE, null, ex);
         } 
    }
    
}
