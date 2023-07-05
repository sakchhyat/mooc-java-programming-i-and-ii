
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sakch
 */
public class ShoppingCart {
    private Map<String, Item> map;
    
    public ShoppingCart(){
        this.map = new HashMap<>();
    }
    
    public void add(String product, int price){
        if(this.map.containsKey(product)){
            this.map.get(product).increaseQuantity();
        }else{
            this.map.put(product, new Item(product, 1 , price));
        }    
    }
    
    public int price(){
        int price = 0;
        for(Item item : this.map.values()){
            price += item.price();
        }
        return price;
    }
    
    public void print(){
        for(Item item : this.map.values()){
            System.out.println(item);
        }
    }
    
    
}
