
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sakch
 */
public class Person {
    private String name;
    private Education course;
    
    public Person(String name, Education course){
        this.name = name;
        this.course = course;
    }
    
    public Education getEducation(){
        return this.course;
    }
    
    public String toString(){
        return this.name + ", " + this.course;
    }
    

}
