/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Visual2022A;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    Connection con;
    String usuario="root";
    String clave="";
    String url="jdbc:mysql://localhost:3306/";
    String bd="visual2022b";

    public Conexion() {
    }
    public Connection getConnection() {
       
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(url+bd, usuario, clave);
            System.out.println("SE CONECTO A BASE DE DATOS "+bd);
            } catch (SQLException | ClassNotFoundException ex) {
                System.err.println("NO SE CONECTO A: "+bd);
                System.out.println(ex);
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    public void desconectar( ) {
        try {
            con.close();
            System.out.println("se desconecto");
        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
