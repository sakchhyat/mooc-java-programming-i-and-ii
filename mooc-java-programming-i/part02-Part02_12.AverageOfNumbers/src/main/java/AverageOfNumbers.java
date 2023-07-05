
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double num = 0;

        while (true) {
            System.out.println("Give a number: ");
            double input = Double.valueOf(scanner.nextLine());
            
            if (input==0) {
                break;
            } else{
                sum += input;
                num += 1;
                
            }
          
        }
        System.out.println("Average of the numbers: " + (sum/num));
    }
}

