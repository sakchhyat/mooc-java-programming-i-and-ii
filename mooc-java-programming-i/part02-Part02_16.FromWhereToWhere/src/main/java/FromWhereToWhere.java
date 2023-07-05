
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Where to?");
        int input = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Where from?");
        int input1 = Integer.valueOf(scanner.nextLine());
       
        for (int i=input1; i<=input; i++){
            System.out.println(i);
        }
       
        
    }
}
