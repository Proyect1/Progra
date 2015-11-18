/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progratransporte;
import java.sql.*;

/**
 *
 * @author 18846373-8
 */
public class conectar {
    static String bd="proyecto";
    static String login="root";
    static String password="cursojava";
    static String url="jdbc:derby://localhost:1527/"+bd;

  Connection con=null;

    public conectar() {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con=DriverManager.getConnection(url,login,password);
            if (con!=null){
                System.out.println("Conección a base de datos "+bd+". listo");
            }
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
  public Connection getConection(){
      return con;
  }
    public void deconectar(){
        con=null;
        System.out.println("la base de datos " +bd+ "a se ha desconectado");
    }
}
