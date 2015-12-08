/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progratransporte;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author claudio
 */
public class classBus {
    conectar con;

    public classBus() {
        con=new conectar();
    }
    
     public void registrar(String patente, String rut,String marca, String modelo,String año, String capacidad){
       try {            
            PreparedStatement pstm = con.getConection().prepareStatement("insert into " + 
                    "bus(patente,rut,marca,modelo,año,capacidad) " +
                    " values(?,?,?,?,?,?)");            
            
            pstm.setString(1, patente);                        
            pstm.setString(2, rut);          
            pstm.setString(3, marca);                        
            pstm.setString(4, modelo); 
            pstm.setString(5, año);                        
            pstm.setString(6, capacidad); 
            pstm.execute();
            pstm.close();            
         }catch(SQLException e){
         System.out.println(e);
      }
   }
     public void update( String patente, String rut,String marca, String modelo,String año, String capacidad){
       try {            
            PreparedStatement pstm = con.getConection().prepareStatement("update bus " +
            "set patente = ? ," + 
           "rut = ? ," +
           "marca = ? ," +  
            "modelo = ? ," +
           "año = ? ," + 
           "capacidad = ? ," +
           "where patente = ? ");            
                          
              pstm.setString(1, patente);                        
            pstm.setString(2, rut);          
            pstm.setString(3, marca);                        
            pstm.setString(4, modelo); 
            pstm.setString(5, año);                        
            pstm.setString(6, capacidad);
            pstm.execute();
            pstm.close();            
         }catch(SQLException e){
         System.out.println(e);
      }
   }
      public void delete(String cod){  
            try {                
                PreparedStatement pstm = con.getConection().prepareStatement("delete from bus where patente = ?");            
                pstm.setString(1, cod);                   
                pstm.execute();
                pstm.close();            
            }catch(SQLException e){
            System.out.println(e);
            }            
   }
      public Object [][] getDatos(){
      int registros = 0;
      //obtenemos la cantidad de registros existentes en la tabla
      try{         
         PreparedStatement pstm = con.getConection().prepareStatement("SELECT count(1) as total FROM bus");
         ResultSet res = pstm.executeQuery();
         res.next();
         registros = res.getInt("total");
         res.close();
      }catch(SQLException e){
         System.out.println(e);
      }
      
    Object[][] data = new String[registros][6];  
    //realizamos la consulta sqol y llenamos los datos en "Object"
      try{    
         PreparedStatement pstm = con.getConection().prepareStatement("SELECT " +
            " patente,rut,marca,modelo,año,capacidad " +
            " FROM bus" +
            " ORDER BY patente ");
         ResultSet res = pstm.executeQuery();
         int i = 0;
         while(res.next()){
             String estpat= res.getString("patente");
             String estrut = res.getString("rut");
            String estmar = res.getString("marca");
            String estmod= res.getString("modelo");
             String estaño = res.getString("año");
            String estcapa = res.getString("capacidad");
            
            data[i][0] = estpat;
            data[i][1] = estrut; 
            data[i][2] = estmar;
            data[i][3] = estmod;
            data[i][4] = estaño; 
            data[i][5] = estcapa;            
            i++;
         }
         res.close();
          }catch(SQLException e){
         System.out.println(e);
    }
    return data;
 }    
}
