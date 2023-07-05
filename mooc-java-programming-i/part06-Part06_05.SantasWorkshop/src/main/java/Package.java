
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
public class Package {
    
    private ArrayList<Gift> gifts = new ArrayList<>();
    
    public void addGift(Gift gift){
        
        gifts.add(gift);
    }
    
    public int totalWeight(){
        int w = 0;
        for(Gift gift : gifts){
            w += gift.getWeight();
        }
        return w;
    }
    
}
