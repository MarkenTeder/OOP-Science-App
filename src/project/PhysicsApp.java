/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project;

/**
 *
 * @author x14111021
 */
public class PhysicsApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PhysicsLcHl myPhysicsLcHl;
        myPhysicsLcHl = new PhysicsLcHl();
        
        PhysicsLcOl myPhysicsLcOl;
        myPhysicsLcOl = new PhysicsLcOl();
        
        PhysicsAssLCOL myPhysicsAssLCOL;
        myPhysicsAssLCOL = new PhysicsAssLCOL();
        
        myPhysicsLcOl.setVisible(true);
    }
    
}
