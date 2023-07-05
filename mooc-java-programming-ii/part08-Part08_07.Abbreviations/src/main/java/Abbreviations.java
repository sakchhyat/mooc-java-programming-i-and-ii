
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
public class Abbreviations {
    
    private HashMap<String, String> abbrev;

    public Abbreviations() {
        this.abbrev = new HashMap<>();
    }
     
    
    public void addAbbreviation(String abbreviation, String explanation){
        this.abbrev.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation){
        return this.abbrev.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation){
        return this.abbrev.get(abbreviation);
    }
    
}
