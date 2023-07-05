/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sakch
 */
public class Timer {
    
    private ClockHand miliSecond;
    private ClockHand seconds;
    
    
    public Timer(){
        this.miliSecond = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }
    
    public void advance(){
        this.miliSecond.advance();
        
        if(this.miliSecond.value() == 0){
            this.seconds.advance();                  
        }        
    }
    
    public String toString() {
            return seconds + ":" + miliSecond;
        }
    
    
    
}
