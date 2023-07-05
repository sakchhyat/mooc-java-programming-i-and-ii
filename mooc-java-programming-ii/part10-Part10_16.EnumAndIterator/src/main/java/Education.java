/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sakch
 */
public enum Education {
    PHD("Doctor degree"),
    MA("Masters degree"),
    BA("Bachelors degree"),
    HS("High School diploma");
    
    private String course;
    
    private Education(String course){
        this.course = course;
    }
    
    public String getCourse(){
        return this.course;
    }
}
