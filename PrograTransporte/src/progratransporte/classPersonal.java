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
public class classPersonal {
    conectar con;

    public classPersonal() {
        con=new conectar();
    }
    
    public void registrar(String login, String clave, String nombre ){
       try {            
            PreparedStatement pstm = con.getConection().prepareStatement("insert into " + 
                    "personal(login,clave,nombre ) " +
                    " values(?,?,?)");            
            pstm.setString(1, login);
            pstm.setString(2, clave);                        
            pstm.setString(3, nombre);          
                                
            pstm.execute();
            pstm.close();            
         }catch(SQLException e){
         System.out.println(e);
      }
   }
     public void update( String login, String clave, String nombre){
       try {            
            PreparedStatement pstm = con.getConection().prepareStatement("update personal " +
            "set login = ? ," + 
           "clave = ? ," +
           "nombre = ? ," +                    
                 
            "where clave = ? ");            
            pstm.setString(1, login);                  
           pstm.setString(2, nombre);
           pstm.setString(3,String.valueOf(clave) );
            pstm.execute();
            pstm.close();            
         }catch(SQLException e){
         System.out.println(e);
      }
   }
      public void delete(String cod){  
            try {                
                PreparedStatement pstm = con.getConection().prepareStatement("delete from pasajeros where clave = ?");            
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
         PreparedStatement pstm = con.getConection().prepareStatement("SELECT count(1) as total FROM personal");
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
            " login,clave,nombre " +
            " FROM personal" +
            " ORDER BY clave ");
         ResultSet res = pstm.executeQuery();
         int i = 0;
         while(res.next()){
             String estcodigo= res.getString("login");
             String estrut = res.getString("clave");
            String estNombre = res.getString("nombre");
            
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
