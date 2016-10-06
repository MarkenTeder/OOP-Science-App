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
public class NotePlan extends StudyPlan_1 {
    
    public String note;
    

    public NotePlan(String day, String subject, double time, double duration, String note){

        super(day, subject, time, duration);
        this.day = note;
        
    }
    
    public void setNote(String note){
        
        this.note = note;
        
    }
    
    public String getNote(){
        
        return note;
        
    }
 
}



