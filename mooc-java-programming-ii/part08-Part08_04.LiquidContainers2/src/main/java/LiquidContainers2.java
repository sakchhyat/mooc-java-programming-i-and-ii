
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();
        int amm = 0;


        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            System.out.print("");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);

            
            if(command.equals("add")){
                first.add(amount);
            }

            if(command.equals("move")){
                
                
                if(first.contains()>=amount){
                    first.remove(amount);
                    second.add(amount);
                }else{ 
                    second.add(first.contains());
                    first.remove(first.contains());
                    
                }

                if(second.contains()>100){
                    first.add(second.contains() -100);
                    second.remove(second.contains() - 100);
                }


            }

            if(command.equals("remove")){
                second.remove(amount);

                if(second.contains()<0)                        
                    second.add(second.contains() * -1);

            }
            
                
        }
    }

}
