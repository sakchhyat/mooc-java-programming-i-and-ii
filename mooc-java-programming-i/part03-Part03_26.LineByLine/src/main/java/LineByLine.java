
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        
        
            
        while (true){
            String text = scanner.nextLine();
            
            String[] text1 = text.split(" "); 
            
            if (text.isBlank()){
                return;
            }
            for( int i=0; i <text1.length; i++){
                System.out.println(text1[i]);
            }
            
            
        } 
    }
}
