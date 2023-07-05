
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sakch
 */
public class IOU {
    private HashMap<String, Double> allMaps;
    
    public IOU(){
        this.allMaps = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount){
        this.allMaps.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom){
        return this.allMaps.getOrDefault(toWhom, 0.0);
    }
    
}
