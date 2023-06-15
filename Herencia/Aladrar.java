/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author yaser
 */
public class Aladrar {
    public static void main(String[] args) {
        Perro rocky = new Perro();
        Perrito firulais = new Perrito();
        //Cachorro galleta = new Cachorro();
        
        rocky.Nombre="Rocky";
        firulais.Nombre="firulais";
        
        rocky.ladrar();
        firulais.ladridito();
        
        
        rocky.mellamo();
        firulais.mellamo();
    }
}
