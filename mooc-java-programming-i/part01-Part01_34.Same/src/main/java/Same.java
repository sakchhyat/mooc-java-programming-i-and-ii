
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String password = scan.nextLine();
        System.out.println("Enter the second string:");
        String password2 = scan.nextLine();
        
    
        
        
        if (password.equals(password2)) {
            System.out.println("Same");

        // Write your program here. 
        } else {
            System.out.println("Different");
        }
    }
}
