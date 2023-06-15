/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author yaser
 */
public class Cachorro extends Perrito{
    String edad;
    public Cachorro(String n2) {
        super(n2);
    }

    public Cachorro(String edad, String Raza, String Nombre) {
        super(Raza, Nombre);
        this.edad = edad;
    }
    
    
    public void ladrididito(){
        System.out.println(Nombre+" que es un cachorro, te esta ladrando: guau guau motherfucker bitchis");
    }
}
