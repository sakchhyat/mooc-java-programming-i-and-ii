
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
public class ChangeHistory {
    private ArrayList<Double> status;

    public ChangeHistory() {
        this.status = new ArrayList<>();
    }
    
    public void add(double status){
        this.status.add(status);
    }
    
    public void clear(){
        this.status.clear();
    }
    
    public String toString(){
        return this.status.toString();
    }
    
    public double maxValue(){
        double max = 0;
        if(this.status.size()>0){
            for(double change: this.status){
                if(change>max){
                    max = change;
                }
            } 
        }
        return max;
    }
    
    public double minValue(){
        double min = 0;
        if(this.status.size()>0){
            min = this.status.get(0);
            for(double change: this.status){
                if(change<min){
                    min = change;
                }
            } 
        }
        return min;
    }
    
    public double average(){
        double sum = 0;
        for(double change: this.status){
            sum += change;
        }
        
        if(sum>0){
            return sum/this.status.size();
        }
        
        return 0;
    }
       
}
