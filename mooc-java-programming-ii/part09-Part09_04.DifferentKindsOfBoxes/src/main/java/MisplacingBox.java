
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
public class MisplacingBox extends Box{
    private ArrayList<Item> itemBox;
    
    public MisplacingBox(){
        super();
        this.itemBox = new ArrayList<>();
    }
    
    public void add(Item item){
        this.itemBox.add(item);
    }
    
    public boolean isInBox(Item item){
        return false;
    }
    
}
