
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give numbers:");
        
        int input = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        int number = 0;
        int odd = 0;
        int even = 0;
        
        while (input!=-1){
            if (input%2 == 0) {
                even +=1;
            } else  {
                odd +=1;
            }
            sum += input;
            number += 1;
            input = Integer.valueOf(scanner.nextLine());   
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: "+ sum);
        System.out.println("Numbers: " + number);
        System.out.println("Average: " +(sum/Double.valueOf(number)));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

    }
}
