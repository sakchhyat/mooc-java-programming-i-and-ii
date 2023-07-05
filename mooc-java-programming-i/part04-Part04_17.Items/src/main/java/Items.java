
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        
        
        while(true){
            System.out.println("Enter a name, empty will stop: ");
            String item = scanner.nextLine();
            if (item.isEmpty()){
                break;
            }else{
                items.add(new Item(item));
            }    
        }
        for(Item iitem : items) {
            System.out.println(iitem);
        }
        
    


    }
}
