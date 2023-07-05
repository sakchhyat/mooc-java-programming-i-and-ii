
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> lists = new ArrayList<>();
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if(number==-1){
                break;
            }
            
            lists.add(number);
        }
        
        int sum =0;
        int count =0;
        
        for (int list : lists){
            sum += list;
        }
        
        System.out.println("Average: "+ (1.0*sum/lists.size()));
    }
}
