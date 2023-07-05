/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sakch
 */
public class Item {
    private String product;
    private int qty;
    private int unitPrice;
    
    public Item(String product, int rty, int unitPrice){
        this.product = product;
        this.qty = rty;
        this.unitPrice = unitPrice;                   
    }
    
    public int price(){
        return this.qty*this.unitPrice;
    }
    
    public void increaseQuantity(){
        this.qty++;
    }
    
    @Override
    public String toString() {
        return this.product + ": " + this.qty;
    }

    
}

    