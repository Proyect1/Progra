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
public class classChofer {
    conectar con;

    public classChofer() {
        con=new conectar();
    }
    public void registrar(String rut, String nombre, String apellido, String movil, String sexo ){
       try {            
            PreparedStatement pstm = con.getConection().prepareStatement("insert into " + 
                    "chofer(rut,nombre, apellido, movil, sexo ) " +
                    " values(?,?,?,?,?)");            
            pstm.setString(1, rut);
            pstm.setString(2, nombre);                        
            pstm.setString(3, apellido);          
            pstm.setString(4, movil);
            pstm.setString(5,sexo);                        
            pstm.execute();
            pstm.close();            
         }catch(SQLException e){
         System.out.println(e);
      }
   }
     public void update( String rut, String name  ,String apellido,String movil, String sexo){
       try {            
            PreparedStatement pstm = con.getConection().prepareStatement("update chofer " +
            "set rut = ? ," + 
           "nombre = ? ," +
           "apellido = ? ," +                    
            "movil = ? " +    
             "sexo = ? " +        
            "where rut = ? ");            
                           
            pstm.setString(1, name);
            pstm.setString(2, apellido);
            pstm.setString(3, movil);
            pstm.setString(4, sexo);
            pstm.setString(5, String.valueOf(rut));   
            pstm.execute();
            pstm.close();            
         }catch(SQLException e){
         System.out.println(e);
      }
   }
      public void delete(String cod){  
            try {                
                PreparedStatement pstm = con.getConection().prepareStatement("delete from chofer where rut = ?");            
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
         PreparedStatement pstm = con.getConection().prepareStatement("SELECT count(1) as total FROM chofer");
         ResultSet res = pstm.executeQuery();
         res.next();
         registros = res.getInt("total");
         res.close();
      }catch(SQLException e){
         System.out.println(e);
      }
      
    Object[][] data = new String[registros][5];  
    //realizamos la consulta sqol y llenamos los datos en "Object"
      try{    
         PreparedStatement pstm = con.getConection().prepareStatement("SELECT " +
            " rut,nombre, apellido, movil, sexo " +
            " FROM chofer" +
            " ORDER BY rut ");
         ResultSet res = pstm.executeQuery();
         int i = 0;
         while(res.next()){
             
             String estrut = res.getString("rut");
            String estNombre = res.getString("nombre");
            String estape = res.getString("apellido");
            String estmo = res.getString("movil");
            String estsex = res.getString("sexo");
           
            data[i][0] = estrut; 
            data[i][1] = estNombre;            
            data[i][2] = estape;            
            data[i][3] = estmo;            
            data[i][4] = estsex;            
            i++;
         }
         res.close();
          }catch(SQLException e){
         System.out.println(e);
    }
    return data;
 }    
}
