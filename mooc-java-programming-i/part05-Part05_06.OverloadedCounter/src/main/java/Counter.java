/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sakch
 */
public class Counter {
 
    private int startValue;

    public Counter() {
        this.startValue = 0;
    }

    public Counter(int startValue) {
        this.startValue = startValue;
    }
    
    public int value(){
        return startValue;
    }
    
    public void increase(){
        this.startValue++;
    }
    
    public void decrease(){
        this.startValue--;
    }
    
    
    public void increase(int increaseBy){
        if(increaseBy>=0){
            this.startValue += increaseBy;
        }
        
    }
    
    public void decrease(int decreaseBy){
        if(decreaseBy>=0){
            this.startValue -= decreaseBy;
        }        
        
    }
    
    
}
