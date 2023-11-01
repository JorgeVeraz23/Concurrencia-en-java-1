/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.concurrencia;

/**
 *
 * @author USER
 */
public class HiloThread extends Thread{
    
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
    
        HiloThread hilo1 = new HiloThread();
        HiloThread hilo2 = new HiloThread();
        
        hilo1.start();
        hilo2.start();
    }
}

