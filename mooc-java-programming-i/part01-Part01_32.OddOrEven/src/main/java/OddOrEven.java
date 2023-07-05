
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scan.nextLine());
        
        if (first%2 == 0) {
            System.out.println("Number " + first + " is even.");
        } else {
            System.out.println("Number " + first + " is odd.");
        }
        

       
    }
}
