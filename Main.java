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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Bancone banco=new Bancone();
        
        Dipendente d1=new Dipendente("Giulio", banco);
        Dipendente d2=new Dipendente("Mario", banco);
        Dipendente d3=new Dipendente("Efesto", banco);
        
        Cuoco c1=new Cuoco("Giorgio", 3, banco);
        
        System.out.println("Inizio pausa pranzo\n");
        
        d1.start();
        d2.start();
        d3.start();
        
        c1.start();
        
        try {
            
           d1.join();
           d2.join();
           d3.join();
           
           c1.join();
           
        } catch (Exception e) {}
        
        System.out.println("\nFine pausa pranzo");
        
    }
    
}
