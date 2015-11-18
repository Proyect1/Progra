package progratransporte;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Procesos {
     conectar con;

    public Procesos() {
        con=new conectar();
    }
  //////////////////////////////////////////////
   public Object [][] claves(){
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
            " codigo,rut,nombre, apellido, apoderado, domicilio " +
            " FROM pasajeros" +
            " ORDER BY codigo ");
         ResultSet res = pstm.executeQuery();
         int i = 0;
         while(res.next()){
             String estcodigo= res.getString("codigo");
             String estrut = res.getString("rut");
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
 }
  ///////////////////////////////////////////////
    
    
}
