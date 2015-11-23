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
public class traslado {
    conectar con;

    public traslado() {
        con=new conectar();
    }
    public void registrar(String rut, String patente, String dia, String  horasalida, String horallegada){
       try {            
            PreparedStatement pstm = con.getConection().prepareStatement("insert into " + 
                    "traslado(rut,patente, dia, hora_salida, hora_llegada ) " +
                    " values(?,?,?,?,?)");            
            pstm.setString(1, rut);
            pstm.setString(2, patente);                        
            pstm.setString(3, dia);          
            pstm.setString(4, horasalida);
            pstm.setString(5, horallegada);                        
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
         PreparedStatement pstm = con.getConection().prepareStatement("SELECT count(1) as total FROM traslado");
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
            " codigo,rut,patente, dia, hora_salida, hora_llegada " +
            " FROM traslado" +
            " ORDER BY dia ");
         ResultSet res = pstm.executeQuery();
         int i = 0;
         while(res.next()){
             String estcodigo= res.getString("codigo");
             String estrut = res.getString("rut");
            String estpa = res.getString("patente");
            String estdia = res.getString("dia");
            String estsali = res.getString("hora_salida");
            String estllega = res.getString("hora_llegada");
            data[i][0] = estcodigo;
            data[i][1] = estrut; 
            data[i][2] = estpa;            
            data[i][3] = estdia;            
            data[i][4] = estsali;            
            data[i][5] = estllega;            
            i++;
         }
         res.close();
          }catch(SQLException e){
         System.out.println(e);
    }
    return data;
 }    }