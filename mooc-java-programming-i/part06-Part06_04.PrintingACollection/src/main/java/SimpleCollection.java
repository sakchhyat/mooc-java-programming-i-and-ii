
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString(){
        String output =  "The collection " + this.name + " has " + elements.size() + " element"; 
        
        
        
        if(this.elements.size()==1){
            output += ":";
        }
        else{
            output += "s:";
            
        }
        
        if(this.elements.isEmpty()){
            output = "The collection " + this.name + " is empty.";
        }
        
        for(String ass : this.elements){
            output +=  "\n" + ass;
        }
        
        return output;
    }
}
