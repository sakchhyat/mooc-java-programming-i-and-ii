
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        
        while(true){
            String scan = scanner.nextLine();
            if(scan.isEmpty()){
                break;
            }
            list.add(scan);
        }
        
        String output = list.stream()
                .reduce("", (previousString, word) -> previousString + word + "\n");
        System.out.println(output);
    }
}
