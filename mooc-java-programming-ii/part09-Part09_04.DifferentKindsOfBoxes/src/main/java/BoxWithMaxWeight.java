
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
public class BoxWithMaxWeight extends Box{
    private int capacity;
    private ArrayList<Item> itemBox;
    
    public BoxWithMaxWeight(int capacity){
        super();
        this.capacity = capacity;
        this.itemBox = new ArrayList<>();
    }
    
    public void add(Item item){
        if(item.getWeight()<=this.capacity){
            this.itemBox.add(item);
            this.capacity -= item.getWeight();
        }
    }
    
    public boolean isInBox(Item item){
        if(this.itemBox.contains(item)){
            return true;
        }
        return false;
    }
    
}
