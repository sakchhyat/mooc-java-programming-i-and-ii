
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        
        if (first>second) {
            System.out.println("Greater number is: " + first);
        } else if (first<second) {
            System.out.println("Greater number is: " + second);
        } else {
            System.out.println("The number are equal!");
        }
        

    }
}
