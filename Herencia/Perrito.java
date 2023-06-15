/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author yaser
 */
//extends dice que hereda de la clase perro sus metodos y demas
public class Perrito extends Perro{
    String Raza;
    public Perrito() {
        
    }
    
    public Perrito(String n){
        super(n);
    }

    public Perrito(String Raza, String Nombre) {
        super(Nombre);
        this.Raza = Raza;
    }
    
    public void ladridito(){
        System.out.println(Nombre+" que es un perrito, te esta ladrando: guau guau motherfucker");
    }
    
    
    
    
}
