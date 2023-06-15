/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hilos;

/**
 *
 * @author yaser
 */
/*

*/
public class Hilo1 extends Thread{
    public int i = 0;
    String nombre;
    int edad;
    String profesion;

    public Hilo1() {
    }

    public Hilo1(String nombre) {
        super (nombre);
        
    }
    
    /*
     Thread a = new Thread() {

            @Override
            public void run() {

                for (int i = 0; i < 101; i++) {
                    

                    pbar2.setValue(i);
                    
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            }
        };
        
        a.start();
    */
    public int run(int x) {
        try {
          
        for (i=0; i < 100; i++) {
            
            System.out.println(i+"=>"+x);
            Thread.sleep(100);
            
        }
        
        
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("termina el hilo "+x);
        return i;
        
    }
    public static void main(String[] args) {
        /*
        new Hilo1("cardenas").start();
        new Hilo1("mayra").start();
        new Hilo1("alberto").start();
        */
    }
    
}
