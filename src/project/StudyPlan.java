/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.Serializable;

/**
 *
 * @author Mark Hayden
 */
public class StudyPlan implements Serializable{
    private String name;
    private String day;
    private int starttime;
    private int fintime;
    
    public StudyPlan() {
       
        name = new String();
        day = new String();
        starttime = 0;
        fintime = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getStarttime() {
        return starttime;
    }

    public void setStarttime(int starttime) {
        this.starttime = starttime;
    }

    public int getFintime() {
        return fintime;
    }

    public void setFintime(int fintime) {
        this.fintime = fintime;
    }
    
    
}
