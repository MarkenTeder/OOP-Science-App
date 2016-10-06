/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project;
import java.io.Serializable;
/**
 *
 * @author x14111021
 */
public class StudyPlan_1 implements Serializable{
    
    String day;
    String subject;
    double duration;
    double time;
    
    public StudyPlan_1(){
    
    day = new String();
    subject = new String();
    duration = 0.0;
    time = 0.0;
    
    }
    
    public StudyPlan_1(String day, String subject, double duration, double time){
        
        this.day = day;
        this.subject = subject;
        this.duration = duration;
        this.time = time;
        
    }
    
    public void setDay(String day){
        
        this.day = day;
        
    }
    
    public void setSubject(String subject){
        
        this.subject = subject;
        
    }
    
    public void setDuration(double duration){
        
        this.duration = duration;
        
    }
    
    public void setTime(double time){
        
        this.time = time;
        
    }
    
    public String getDay(){
        return day;
    }

    public String getSubject() {
        return subject;
    }

    public double getDuration() {
        return duration;
    }

    public double getTime() {
        return time;
    }
    
    
    
    
}
