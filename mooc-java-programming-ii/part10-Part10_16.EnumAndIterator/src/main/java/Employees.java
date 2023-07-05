
import java.util.ArrayList;
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
public class Employees {
    private ArrayList<Person> employees;
    
    public Employees(){
        this.employees = new ArrayList<>();
    }
    
    public void add(Person personToAdd){
        this.employees.add(personToAdd);
    }
    
    public void print(){
        Iterator<Person> iterator = this.employees.iterator();
        
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        
    }
    
    public void print(Education education){
        Iterator<Person> iterator = this.employees.iterator();
        
        while(iterator.hasNext()){
            Person check = iterator.next();
            if(check.getEducation().equals(education)){
                System.out.println(check);
            }        
        } 
    }
    
    public void fire(Education education){
        Iterator<Person> iterator = this.employees.iterator();
        
        while(iterator.hasNext()){
            if(iterator.next().getEducation().equals(education)){
                iterator.remove();
            }        
        } 
    }
    
    public void add(List<Person> peopleToAdd){
        Iterator<Person> iterator = peopleToAdd.iterator();

        while(iterator.hasNext()){
            this.employees.add(iterator.next());
        }
    }
}
