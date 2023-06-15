/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen_diagnostico;



/**
 *
 * @author yaser
 */
public class Alumnos 
{
    private String nombre;
    private String ApellidoP;
    private String ApellidoM;
    private String Dob;
    private String licenciatura;

    public Alumnos() {
    }

    public Alumnos(String nombre, String ApellidoP, String ApellidoM, String Dob, String licenciatura) {
        this.nombre = nombre;
        this.ApellidoP = ApellidoP;
        this.ApellidoM = ApellidoM;
        this.Dob = Dob;
        this.licenciatura = licenciatura;
    }
    
    public Alumnos(String nombre, String ApellidoP, String ApellidoM, String Dob) {
        this.nombre = nombre;
        this.ApellidoP = ApellidoP;
        this.ApellidoM = ApellidoM;
        this.Dob = Dob;
    }
    
    public Alumnos(String nombre, String ApellidoP, String ApellidoM) {
        this.nombre = nombre;
        this.ApellidoP = ApellidoP;
        this.ApellidoM = ApellidoM;
        
    }

    public void setApellidoM(String ApellidoM) {
        this.ApellidoM = ApellidoM;
    }

    public void setApellidoP(String ApellidoP) {
        this.ApellidoP = ApellidoP;
    }

    public void setDob(String Dob) {
        this.Dob = Dob;
    }

    public void setLicenciatura(String licenciatura) {
        this.licenciatura = licenciatura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoM() {
        return ApellidoM;
    }

    public String getApellidoP() {
        return ApellidoP;
    }

    public String getDob() {
        return Dob;
    }

    public String getLicenciatura() {
        return licenciatura;
    }

    public String getNombre() {
        return nombre;
    }
    
         

    
    
}
