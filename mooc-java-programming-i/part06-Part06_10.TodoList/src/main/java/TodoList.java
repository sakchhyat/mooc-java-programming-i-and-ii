
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
public class TodoList {
    private ArrayList<String> todos;

    public TodoList() {
        this.todos = new ArrayList<>();
    }
    
    public void add(String task){
        todos.add(task);
    }
    
    public void print(){
        for(int i=0; i<this.todos.size(); i++){
            System.out.println(i+1 + ": " + this.todos.get(i) );
        }
    }
    
    public void remove(int number){
        this.todos.remove(number-1);
    }
    
}
