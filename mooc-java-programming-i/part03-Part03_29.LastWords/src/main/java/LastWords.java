
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String text = scanner.nextLine();
            
            String[] text1 = text.split(" "); 
            
            if (text.isBlank()){
                return;
            }
            System.out.println(text1[text1.length - 1]);
            
            
        } 


    }
}
