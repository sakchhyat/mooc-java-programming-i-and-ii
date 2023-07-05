
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
public class Suitcase {
    private ArrayList<Item> items = new ArrayList<>();
    private int maxWeight;
    
    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
    }
    
    public int totalWeight(){
        int totalWeight = 0;
        for(Item itemm : items){
            totalWeight += itemm.getWeight();
        }
        return totalWeight;
    }
    
    public void addItem(Item item){
        
        int futWeight = totalWeight() + item.getWeight();
        if(futWeight<=this.maxWeight){
            this.items.add(item);
        }
        
    }
    
    public String listItems(){
        
        String listItems =  "";
        
        for(Item item : items){
            listItems += item.toString() + "\n";
        }
        
        return listItems;
    }
    
    public void printItems(){
        for (Item itemm : items){
            System.out.println(itemm);
        }
    }
    
    public String toString(){
        if(items.isEmpty()){
            return "no items (0 kg)";
        }
        if(items.size()==1){
            return this.items.size() + "item (" + totalWeight() + " kg)";
        }
        return this.items.size() + "items (" + totalWeight() + " kg)";
    }
    
    public Item heaviestItem(){
        
        if(items.isEmpty()){
            return null;
        }
        
        Item heaviest = items.get(0);
        for(Item itemm : items){
            if(itemm.getWeight()>heaviest.getWeight()){
                heaviest = itemm;
                        
            }
        }
        
        return heaviest;
    }
    
    
}
