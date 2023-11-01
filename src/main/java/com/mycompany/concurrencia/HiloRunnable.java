/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.concurrencia;

/**
 *
 * @author USER
 */
public class HiloRunnable implements Runnable{
    public void run(){
        for(int i = 0; i <=5; i++){
            System.out.println("Hilo " + Thread.currentThread().threadId() + " : "+ i);
            try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("El hilo se a interrumpido");
        }
        } 
    }
    public static void main(String[] args){
        HiloRunnable runnable1 = new HiloRunnable();
        HiloRunnable runnable2 = new HiloRunnable();
        
        Thread hilo1 = new Thread(runnable1);
        Thread hilo2 = new Thread(runnable2);
        
        hilo1.start();
        hilo2.start();
    }
}
