
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
       
        int input = Integer.valueOf(scanner.nextLine());
        int result = 1;
        
        for (int i=1; i<=input; i++){
            result *= i;
            
        }
        System.out.println(result);

    }
}