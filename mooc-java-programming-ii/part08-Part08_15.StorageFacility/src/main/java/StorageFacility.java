
import java.util.ArrayList;
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
public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }
    
    public void add(String unit, String item){
        if(!this.storage.containsKey(unit)){
            this.storage.put(unit, new ArrayList<>());
        }
        this.storage.get(unit).add(item);
    }
    
    public void remove(String storageUnit, String item){
        if(this.storage.containsKey(storageUnit)){
            int count =0;
            for(String itm: this.storage.get(storageUnit)){
                if(itm.equals(item)){
                    count++;
                }
            }
            
            if(count>0){
                this.storage.get(storageUnit).remove(item);
            }else{
                this.storage.remove(storageUnit);
            }
        }
    }
    public ArrayList<String> contents(String storageUnit){
        if(!this.storage.containsKey(storageUnit)){
            return new ArrayList<>();
        }
        return this.storage.get(storageUnit);
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> listss = new ArrayList<>();
        for(String strgUnit: this.storage.keySet()){
            if(this.storage.get(strgUnit).size()>0){
                listss.add(strgUnit);
            }
        }
        return listss;
    }
    
    
}
