
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
public class Stack {
    private ArrayList<String> stacks;
    
    
    public Stack(){
        this.stacks = new ArrayList<String>();
    }
    
    public boolean isEmpty(){
        return this.stacks.isEmpty();
    }
    
    public void add(String value){
        this.stacks.add(value);
    }
    
    public ArrayList<String> values(){
        return this.stacks;
    }
    
    public String take(){
        String take = this.stacks.get(this.stacks.size()-1);
        this.stacks.remove(take);
        return take;
    }
}
