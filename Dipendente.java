/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compitocerbai;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lasmeucci
 */
public class Dipendente extends Thread{

    private Bancone banco;
    public Dipendente(String name, Bancone banco) {
        super(name);
        this.banco=banco;
    }

    @Override
    public void run() {

        try {
            
            banco.preleva();
            
        } catch (InterruptedException e){}
        
    }
    
    
    
}
