
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> arc = new ArrayList<>();
        Archive one;
        
        while(true){
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            
            one = new Archive(identifier, name);
            if(!(arc.contains(one))){
                arc.add(one);
            }  
        }
        
        System.out.println("==Items==");    
        for(Archive ar : arc){
            System.out.println(ar);
        }


    }
}
