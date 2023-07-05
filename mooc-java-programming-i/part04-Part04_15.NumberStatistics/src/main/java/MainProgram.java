
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
     
        
        Statistics statt = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();
        
        
        System.out.println("Enter numbers:");
        
        
        while (true) {
            int value = Integer.valueOf(scanner.nextLine());
            
            
            if (value!=-1){
                statt.addNumber(value);
                if(value%2 ==0){
                    even.addNumber(value);
                } else{
                    odd.addNumber(value);
                }   
            }else {
                
                System.out.println("Sum: "+ statt.sum());
                System.out.println("Sum of even numbers: "+ even.sum());
                System.out.println("Sum of odd numbers: "+ odd.sum());
                return;
            }    
        }
    }

}