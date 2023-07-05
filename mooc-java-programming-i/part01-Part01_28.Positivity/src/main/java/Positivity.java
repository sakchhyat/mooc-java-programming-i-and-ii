
import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give speed:");
        int speed = Integer.valueOf(scan.nextLine());
        
        if (speed>0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }

        // Write your program here
    }
}
