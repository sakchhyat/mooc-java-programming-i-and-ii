
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sakch
 */
public class Warehouse {
    private Map<String, Integer> warehousePrice;
    private Map<String, Integer> warehouseStock;
    
    public Warehouse(){
        this.warehousePrice = new HashMap<String, Integer>();
        this.warehouseStock = new HashMap<String, Integer>();
    }
    
    public void addProduct(String product, int price, int stock){
        this.warehousePrice.put(product, price);
        this.warehouseStock.put(product, stock);
    }
    
    public int stock(String product){
        if(this.warehouseStock.containsKey(product)){
            return this.warehouseStock.get(product);
        }else{
            return 0;
        }    
    }
    
    public int price(String product){
        if(this.warehousePrice.containsKey(product)){
            return this.warehousePrice.get(product);
        }else{
            return -99;
        }
    }
    
	public boolean take(String product) {
		if (this.warehouseStock.containsKey(product) && this.warehouseStock.get(product) > 0) {
			this.warehouseStock.put(product, this.warehouseStock.get(product)-1);
			return true;
		}
		return false;
	}
    
    public Set<String> products(){
        return this.warehousePrice.keySet();
    }
    
    
    
}
