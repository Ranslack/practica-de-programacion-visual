/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Base_de_Datos;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.*;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author yaser
 */
public class Alumno {
    
    Statement stmt;
    Conexion cc=new Conexion();
    Connection cn=cc.getConnection();
    
    
    public void InsertarAlumno(String Nombre, String ApellidoP,String ApellidoM, Date DoB) {
        try {
        
            stmt=cn.createStatement();
            String str = String.format(
            "INSERT INTO alumnos(idAlumnos,Nombre,ApellidoP,ApellidoM,DoB) "
                    + "VALUES('%1$s','%2$s','%3$s','%4$s','%5$s')",0,Nombre, ApellidoP, ApellidoM,DoB);
            stmt.executeUpdate(str); 
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al ingresar los datos "+ e,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
           
    }
    
}
