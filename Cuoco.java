/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compitocerbai;

/**
 *
 * @author Lasmeucci
 */
public class Cuoco extends Thread{
    
    private Bancone banco;
    private int nClienti;
    private int nPiatto=1;
    
    public Cuoco(String name, int nClienti, Bancone banco) {
        super(name);
        this.nClienti=nClienti;
        this.banco=banco;
    }

    @Override
    public void run() {
        
        try {
            
            while (nClienti>0) {                
                
                nClienti--;
                banco.deposita(nPiatto);
                nPiatto++;
                
            }
               
        } catch (Exception e){}
        
    }
    
}
