
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        while(true){
            String scan = scanner.nextLine();
            if(Integer.valueOf(scan) < 0){
                break;
            }
            list.add(Integer.valueOf(scan));
        }
        
        String output = list.stream()
                .filter(value -> value >= 1 && value <= 5)
                .map(Object::toString)
                .reduce("", (previousString, word) -> previousString + word + "\n");
        System.out.println(output);
        
       
   }
}