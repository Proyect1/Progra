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
public class mensualidad {
    conectar con;

    public mensualidad() {
        
        con=new conectar();
    }
    
     public void registrar(String rut, String login,String año , String mes, String monto ){
       try {            
            PreparedStatement pstm = con.getConection().prepareStatement("insert into " + 
                    "mensualidad(rut,login, año, mes, monto ) " +
                    " values(?,?,?,?,?)");            
            pstm.setString(1, rut);
            pstm.setString(2, login);                        
            pstm.setString(3, año);          
            pstm.setString(4, mes);
            pstm.setString(5, monto);                        
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
         PreparedStatement pstm = con.getConection().prepareStatement("SELECT count(1) as total FROM mensualidad");
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
            " codigo,rut,login,año,mes,monto " +
            " FROM mensualidad" +
            " ORDER BY codigo ");
         ResultSet res = pstm.executeQuery();
         int i = 0;
         while(res.next()){
             String cod=res.getString("codigo");
             String estcodigo= res.getString("rut");
             String estrut = res.getString("login");
            String estNombre = res.getString("año");
            String estmes = res.getString("mes");
            String estmon = res.getString("monto");
            data[i][0] = cod;
            data[i][1] = estcodigo;
            data[i][2] = estrut; 
            data[i][3] = estNombre; 
            data[i][4] = estmes; 
            data[i][5] = estmon;  
                    
            i++;
         }
         res.close();
          }catch(SQLException e){
         System.out.println(e);
    }
    return data;
 }    
}
