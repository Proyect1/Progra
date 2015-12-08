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
public class classColegio {
    conectar con;

    public classColegio() {
        con=new conectar();
    }
    public void registrar(String nombre, String direccion){
       try {            
            PreparedStatement pstm = con.getConection().prepareStatement("insert into " + 
                    "colegio(nombre, direccion ) " +
                    " values(?,?)");            
            
            pstm.setString(1, nombre);                        
            pstm.setString(2, direccion);          
                                 
            pstm.execute();
            pstm.close();            
         }catch(SQLException e){
         System.out.println(e);
      }
   }
     public void update( String codigo,String nombre,String direccion){
       try {            
            PreparedStatement pstm = con.getConection().prepareStatement("update colegio " +
            "set codigo = ? ," + 
           "Nombre = ? ," +
           "direccion = ? ," +                    
           "where codigo = ? ");            
                          
            pstm.setString(1, nombre);
            pstm.setString(2, direccion);
           
            pstm.setString(3,String.valueOf(codigo) );
            pstm.execute();
            pstm.close();            
         }catch(SQLException e){
         System.out.println(e);
      }
   }
      public void delete(String cod){  
            try {                
                PreparedStatement pstm = con.getConection().prepareStatement("delete from colegio where codigo = ?");            
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
         PreparedStatement pstm = con.getConection().prepareStatement("SELECT count(1) as total FROM colegio");
         ResultSet res = pstm.executeQuery();
         res.next();
         registros = res.getInt("total");
         res.close();
      }catch(SQLException e){
         System.out.println(e);
      }
      
    Object[][] data = new String[registros][3];  
    //realizamos la consulta sqol y llenamos los datos en "Object"
      try{    
         PreparedStatement pstm = con.getConection().prepareStatement("SELECT " +
            " codigo,nombre,direccion " +
            " FROM colegio" +
            " ORDER BY codigo ");
         ResultSet res = pstm.executeQuery();
         int i = 0;
         while(res.next()){
             String estcodigo= res.getString("codigo");
             String estrut = res.getString("nombre");
            String estNombre = res.getString("direccion");
            
            data[i][0] = estcodigo;
            data[i][1] = estrut; 
            data[i][2] = estNombre;            
                      
            i++;
         }
         res.close();
          }catch(SQLException e){
         System.out.println(e);
    }
    return data;
 }    
}
