/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compitocerbai;

import java.util.Random;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Lasmeucci
 */
public class Bancone {
    
    protected static Semaphore V=new Semaphore(1); //semaforo vuoto
    protected static Semaphore P=new Semaphore(0); //semaforo pieno
    
    private int numPiatto;
    
    public void deposita(int numeroPiatto) throws InterruptedException{  //metodo cuoco
        
        V.acquire();
        numPiatto=numeroPiatto;
        
        Thread.sleep(new Random().nextInt(4)+1); //attesa preparazione piatto
        
        System.out.println("Il piatto n° " + numPiatto + " è pronto");
        P.release();
        
        
    }
    
    public int preleva() throws InterruptedException{    //metodo dipendente
        
        int numP;
        
        P.acquire();
        numP=numPiatto;     
        
        System.out.println("Consumo: " + numPiatto);
        Thread.sleep(new Random().nextInt(8)+1); //attesa consumazione
        
        V.release();
        
        return numP;
        
    }
    
}
