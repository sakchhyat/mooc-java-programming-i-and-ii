/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author sakch
 */
public class TemperatureSensor implements Sensor {
    
    private boolean onOrOff;
    
    public TemperatureSensor(){
        this.onOrOff = false;
    }

    @Override
    public boolean isOn() { 
        return this.onOrOff;
    }

    @Override
    public void setOn() {
        this.onOrOff = true;
    }

    @Override
    public void setOff() {
        this.onOrOff = false;
    }

    @Override
    public int read() {
        if(isOn()){
            return (int)(Math.random()*60) - 30;
        }else{
            throw new IllegalStateException();
        }
    }
    
}
