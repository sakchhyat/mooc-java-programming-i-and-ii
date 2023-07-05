
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sakch
 */
public class Room {
    private ArrayList<Person> list = new ArrayList<>();
    
    public void add(Person person){
        this.list.add(person);
    }
    
    public boolean isEmpty(){
        return this.list.isEmpty();
    }
    
    public ArrayList<Person> getPersons(){
        return this.list;
    }
    
    public Person shortest(){
        if(isEmpty()){
            return null;
        }
        
        Person shortestPerson = this.list.get(0);
        
        for(Person p : this.list){
            if(p.getHeight()<shortestPerson.getHeight()){
                shortestPerson = p;
            }
        }
        
        return shortestPerson;
    }
    
    public Person take(){
        if(isEmpty()){
            return null;
        }
        
        Person shortt = shortest();
        this.list.remove(shortt);
        
        return shortt;
        
    }
}
