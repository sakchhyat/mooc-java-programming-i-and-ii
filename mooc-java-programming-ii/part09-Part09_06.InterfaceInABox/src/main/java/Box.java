
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
public class Box implements Packable{
    
    private double maxWeight;
    private ArrayList<Packable> boxItems;
    
    public Box(double maxWeight){
        
        this.maxWeight = maxWeight;
        this.boxItems = new ArrayList<>();
    }
    
    public void add(Packable packable){
        if(this.weight() + packable.weight() <= maxWeight){
            this.boxItems.add(packable);
        }
    }
    
    public double weight(){
        double weight = 0;
        
        for(Packable packable : this.boxItems){
            weight += packable.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + this.boxItems.size() + " items, " + "total weight " + weight() + " kg";
    }
        
}
