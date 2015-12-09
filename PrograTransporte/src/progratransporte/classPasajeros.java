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
public class classPasajeros {
    conectar con;

    public classPasajeros() {
        con=new conectar();
    }
  public void registrar(String rut, String nombre, String apellido, String apoderado, String domicilio ){
       try {            
            PreparedStatement pstm = con.getConection().prepareStatement("insert into " + 
                    "pasajeros(rut,nombre, apellido, apoderado, domicilio ) " +
                    " values(?,?,?,?,?)");            
            pstm.setString(1, rut);
            pstm.setString(2, nombre);                        
            pstm.setString(3, apellido);          
            pstm.setString(4, apoderado);
            pstm.setString(5, domicilio);                        
            pstm.execute();
            pstm.close();            
         }catch(SQLException e){
         System.out.println(e);
      }
   }
     public void update( String codigo,String rut, String name  ,String apellido, String apoderado,String domicilio){
       try {            
            PreparedStatement pstm = con.getConection().prepareStatement("update pasajeros " +
            "set rut = ? ," + 
           "Nombre = ? ," +
           "apellido = ? ," +                    
            "apoderado = ? " +    
             "domicilio = ? " +        
            "where codigo = ? ");            
            pstm.setString(1, rut);                  
            pstm.setString(2, name);
            pstm.setString(3, apellido);
            pstm.setString(4, apoderado);
            pstm.setString(5, domicilio);
            pstm.setString(6,String.valueOf(codigo) );
            pstm.execute();
            pstm.close();            
         }catch(SQLException e){
         System.out.println(e);
      }
   }
      public void delete(String cod){  
            try {                
                PreparedStatement pstm = con.getConection().prepareStatement("delete from pasajeros where rut = ?");            
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
         PreparedStatement pstm = con.getConection().prepareStatement("SELECT count(1) as total FROM pasajeros");
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
            " rut,codigo,nombre, apellido, apoderado, domicilio " +
            " FROM pasajeros" +
            " ORDER BY rut ");
         ResultSet res = pstm.executeQuery();
         int i = 0;
         while(res.next()){
             String estcodigo= res.getString("rut");
             String estrut = res.getString("codigo");
            String estNombre = res.getString("nombre");
            String estape = res.getString("apellido");
            String estapo = res.getString("apoderado");
            String estdom = res.getString("domicilio");
            data[i][0] = estcodigo;
            data[i][1] = estrut; 
            data[i][2] = estNombre;            
            data[i][3] = estape;            
            data[i][4] = estapo;            
            data[i][5] = estdom;            
            i++;
         }
         res.close();
          }catch(SQLException e){
         System.out.println(e);
    }
    return data;
 }    }
