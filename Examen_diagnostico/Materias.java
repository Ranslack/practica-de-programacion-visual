/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen_diagnostico;

/**
 *
 * @author yaser
 */
public class Materias {
    private int idMaterias;
    private String nombre;
    private String clave;
    private String codigo;
    private String lic;

    public Materias() {
        
    }
    
    public Materias(int idMateria) {
        this.idMaterias=idMateria;
    }

    public Materias(int idMaterias, String nombre, String clave, String codigo, String lic) {
        this.idMaterias = idMaterias;
        this.nombre = nombre;
        this.clave = clave;
        this.codigo = codigo;
        this.lic = lic;
    }
    
    public Materias(int idMaterias, String nombre, String clave, String codigo) {
        this.idMaterias = idMaterias;
        this.nombre = nombre;
        this.clave = clave;
        this.codigo = codigo;
        
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setLic(String lic) {
        this.lic = lic;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getIdMaterias() {
        return idMaterias;
    }

    public String getLic() {
        return lic;
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
