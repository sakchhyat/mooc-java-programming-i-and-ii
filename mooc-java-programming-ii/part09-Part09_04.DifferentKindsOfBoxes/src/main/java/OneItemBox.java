
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
public class OneItemBox extends Box{
    private int capacity;
    private ArrayList<Item> itemBox;
    
    public OneItemBox(){
        super();
        this.itemBox = new ArrayList<>();
        this.capacity = 1;
    }
    
    public void add(Item item){
        if(this.itemBox.size()<1){
            this.itemBox.add(item);
        }
    }
    
    public boolean isInBox(Item item) {
        if (this.itemBox.isEmpty()) {
            return false;
        }

        return this.itemBox.get(0).equals(item);
    }

}
