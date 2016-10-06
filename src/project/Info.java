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
public class Info {
    private String name;
    private int timestart;
    private int timefin;
    
    public Info(String name, int timestart, int timefin){
        this.name = name;
        this.timestart = timestart;
        this.timefin = timefin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTimestart() {
        return timestart;
    }

    public void setTimestart(int timestart) {
        this.timestart = timestart;
    }

    public int getTimefin() {
        return timefin;
    }

    public void setTimefin(int timefin) {
        this.timefin = timefin;
    }
    
    public String getDetails(){
        return "Employee Name: "+name+ "\nStart Time:" +timestart+ "\nFinish Time:" +timefin;
    }
    
    
}
