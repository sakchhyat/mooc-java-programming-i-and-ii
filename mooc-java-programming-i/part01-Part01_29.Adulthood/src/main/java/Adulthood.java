
import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you?");
        int speed = Integer.valueOf(scan.nextLine());
        
        if (speed>=18) {
            System.out.println("You are an adult");
        } else{
            System.out.println("You are not an adult");
        }

        // Write your program here 
    }
}
