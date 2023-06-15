/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen_diagnostico;


public class Inscritos {
    private int claveinscripcion;
    private Alumnos alumno;
    private Materias materia;
    private Maestros maestro;

    public Inscritos() {
    }

    
    public Inscritos(int claveinscripcion, Alumnos alumno, Materias materia, Maestros maestro) {
        this.claveinscripcion = claveinscripcion;
        this.alumno = alumno;
        this.materia = materia;
        this.maestro = maestro;
    }
    
    
    
}
