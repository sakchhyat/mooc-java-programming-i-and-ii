
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
public class Hold {
    
    private int maxWeight;
    private ArrayList<Suitcase> suits = new ArrayList<>();
    
    
    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
    }
    
    public int getTotalHoldWeight(){
        int totalWeight = 0;
        for(Suitcase suit : suits){
            totalWeight += suit.totalWeight();
        }
        return totalWeight;
    }
    
    public void addSuitcase(Suitcase suitcase){
        
        int futWeight = getTotalHoldWeight() + suitcase.totalWeight();
        if(futWeight<=this.maxWeight){
            this.suits.add(suitcase);
        }
    }    
       
    public void printItems(){
        for (Suitcase suit : suits){
            System.out.println(suit.listItems());
        }
    }
    
    public String toString() {
        return this.suits.size() + " suitcases (" + this.getTotalHoldWeight() + " kg)";
    }
    
    
}
