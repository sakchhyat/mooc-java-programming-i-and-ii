
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        ArrayList<String> list = new ArrayList<>(); 
        System.out.println("Input numbers, type \"end\" to stop.");
        
        while(true){
            String input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }
            list.add(input);                             
        }
        
        System.out.println("Print the average og the negative numbers or the positive"
                + " number?(n/p)");
        String respond = scanner.nextLine();
        ArrayList<String> news = new ArrayList<>();
        
        if(respond.equals("n")){
            
            for(String number : list){
                if(Integer.valueOf(number)<0){
                    news.add(number);
                }
            }   
            
        }else if(respond.equals("p")){
             
            for(String number : list){
                if(Integer.valueOf(number)>0){
                    news.add(number);
                }
            }            
        }else{
            System.out.println("Error");
        }    
        
        
        double average = news.stream()
        .mapToInt(s -> Integer.valueOf(s)).average().getAsDouble();        
        System.out.println("average of the numbers: " + average);
                
        
        

    }
} 