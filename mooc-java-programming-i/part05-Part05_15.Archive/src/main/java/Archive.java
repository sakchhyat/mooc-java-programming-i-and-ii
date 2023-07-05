/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sakch
 */
public class Archive {
    
    private String name;
    private String identifier;

    public Archive(String identifier, String name) {
        this.name = name;
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public String getIdentifier() {
        return identifier;
    }
    
    
    
    
    public boolean equals(Object asd){
        
        Archive comp = (Archive)asd;
        
        return(this.identifier.equals(comp.identifier));
           
    }

    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }
    
   
    
    
}
