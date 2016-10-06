/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Mark Hayden
 */
public class Exam extends Info {
    private String day;
    private String location;
    
    public Exam(String name, int timestart, int timefin, String day, String location){
        super(name,timestart,timefin);
        this.day = day;
        this.location = location;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
     @Override
    public String getDetails(){
        return super.getDetails()+"\nDay of Exam: "+getDay() + "\nLocation: "+getLocation();
    }
}
