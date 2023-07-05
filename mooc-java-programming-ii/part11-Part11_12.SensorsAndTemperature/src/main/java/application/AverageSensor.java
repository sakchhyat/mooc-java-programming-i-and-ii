/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sakch
 */
public class AverageSensor implements Sensor {
    private List<Sensor> sensorList;
    private List<Integer> output;
    
    public AverageSensor(){
        this.sensorList = new ArrayList<>();
        this.output = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd){
        this.sensorList.add(toAdd);
    }
    
    @Override
    public boolean isOn() {
        boolean isOn = true;
        for(Sensor sens: sensorList){
            if(!sens.isOn()){
                isOn = false;
                break;
            }
        }
        return isOn;
    }

    @Override
    public void setOn() {
        for(Sensor sens: sensorList){
            sens.setOn();                       
        }
    }

    @Override
    public void setOff() {
        for(Sensor sens: sensorList){
            sens.setOff();                       
        }
    }

    @Override
    public int read() {
        int total = 0;
        
        for(Sensor sens: sensorList){
            total += sens.read();
        }
        
        if(total==0){
            throw new IllegalStateException();
        }
        output.add(total/sensorList.size());
        return total/sensorList.size();
    }
    
    public List<Integer> readings(){        
        return this.output;
    }
    
}
