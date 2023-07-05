
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        while (true){
            String text = scanner.nextLine();
            
            
            
            String[] text1 = text.split(","); 
            
            if (text.isBlank()){
                System.out.println(sum);
                return;
            }
            
            if(Integer.valueOf(text1[1])>sum){
                sum= Integer.valueOf(text1[1]);
            }
            
            
        }
        

    }
}
