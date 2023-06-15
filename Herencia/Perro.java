/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author yaser
 */
public class Perro {
    String Nombre;

    public Perro() {
    
    }

    public Perro(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public void ladrar(){
        System.out.println(Nombre+ "te esta ladrando");
    }
    public void mellamo(){
        System.out.println("mi perro se llama: "+Nombre);
    }
    
    
}

