/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project;

/**
 *
 * @author x14110822
 */
public class BiologyApp {
    private static BiologyLcOl myBiologyLcOl;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BiologyLcHl myBiologyLcHl;
        myBiologyLcHl = new BiologyLcHl();
        
       
        myBiologyLcOl = new BiologyLcOl();
        
        BiologyAssLCOL myBiologyAssLCOL;
        myBiologyAssLCOL = new BiologyAssLCOL();
        
        myBiologyLcOl.setVisible(true);
    }
    
}
