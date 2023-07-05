/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author sakch
 */
public class SaveableDictionary {
    private HashMap<String, String> dictionary;
    private String fileName;
    
    public SaveableDictionary(){
        this.dictionary = new HashMap<>();
    }
    
    public SaveableDictionary(String file){
        this.dictionary = new HashMap<>();
        this.fileName = file;
        
    }
    
    public boolean load(){
        try(Scanner scanner = new Scanner(Paths.get(this.fileName))){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    String key = parts[0];
                    String value = parts[1];
                    this.add(key, value);
                }
            }
            return true;              
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            return false;
        }   

    }
   
    public void add(String words, String translation){
        if(!this.dictionary.containsKey(words)){
            this.dictionary.put(words, translation);
        }
    }
    
    public String translate(String word){
        if(this.dictionary.containsKey(word)){
           return this.dictionary.get(word);
        }else if(this.dictionary.containsValue(word)) {
            for(String key: this.dictionary.keySet()){
                if(this.dictionary.get(key).equals(word)){
                    return key;
                }
            }
        }
      
        return null;
    }
    
    public boolean save(){
        try(PrintWriter writer = new PrintWriter(this.fileName)){
            for (String key : this.dictionary.keySet()) {
                writer.println(key + ":" + this.dictionary.get(key));
            }
            
            writer.close();
            return true;
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            return false;
        }
        
        
    }
    public void delete(String word){
        if(this.dictionary.containsKey(word)){
           this.dictionary.remove(word);
        }
        else if(this.dictionary.containsValue(word)) {
             ArrayList<String> keysToRemove = new ArrayList<>();
            for (String key : this.dictionary.keySet()) {
                if (this.dictionary.get(key).equals(word)) {
                    keysToRemove.add(key);
                }
            }
            for (String key : keysToRemove) {
                this.dictionary.remove(key);
            }
        }
    }
}
