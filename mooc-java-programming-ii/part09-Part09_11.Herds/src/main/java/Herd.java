
import java.util.ArrayList;
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
public class Herd implements Movable{
    private List<Movable> herd;
    
    public Herd(){
        this.herd = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable){
        this.herd.add(movable);
    }

    @Override
    public String toString() {
        
        if(this.herd.size()<1){
            return "Error";
        }else{
            StringBuilder sb = new StringBuilder();
            for(Movable animal: this.herd){
                sb.append(animal.toString()).append("\n");
            }
            return sb.toString();
        }
    }
    
    @Override
    public void move(int dx, int dy) {
       for(Movable animal: this.herd){
           animal.move(dx, dy);
       }
    }
    
}
