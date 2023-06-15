/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;
import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
/**
 *
 * @author yaser
 */
public class Conexion {
    private Connection c;
    private static String usuario="root";
    private static String clave="";
    private static String url="jdbc:mysql://localhost:3306/";
    private static String bd="hotel";
    
    
    public Connection getconection(){
    
        
        
    return c;
    }
    
}
