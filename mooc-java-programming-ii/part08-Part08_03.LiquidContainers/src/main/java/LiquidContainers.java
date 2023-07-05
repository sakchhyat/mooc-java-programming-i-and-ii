
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.printf("%nFirst: %d/100", first);
            System.out.printf("%nSecond: %d/100", second);
            System.out.print("");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);

            if(amount>0){
                if(command.equals("add")){
                    first += amount;
                    if(first>100){
                        first = 100;
                    }
                }

                if(command.equals("move")){
                    second += amount;
                    first -= amount;
                    
                    if(first<0){
                        second += first;
                        first = 0;
                    }
                    
                    if(second>100){
                        first += second -100;
                        second =100;
                    }
                    
                    
                }

                if(command.equals("remove")){
                    second -= amount;
                    
                    if(second<0)
                        second = 0;

                }
            }
                
        }
    }

}
