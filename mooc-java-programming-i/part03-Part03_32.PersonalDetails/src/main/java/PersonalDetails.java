
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum =0;
        String name ="";
        int years = 0;
        int count =0;
        
        while (true){
            String text = scanner.nextLine();
            
            
            
            String[] text1 = text.split(","); 
            
            if (text.isBlank()){
                System.out.println("Longest name: " + name);
                System.out.println("Average of the birth years: " + (1.0*years/count));
                
                return;
            }
            
            if((text1[0].length())>sum){
                sum= text1[0].length();
                name = text1[0];
            }
            
            years += Integer.valueOf(text1[1]);
            count++;
                    
            
            
        }
        

    }
}
