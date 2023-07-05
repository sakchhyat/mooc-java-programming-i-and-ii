
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter =0;
        
        while(true){
            String add = scanner.nextLine();
            if ((add.isEmpty()) || (add.equals("end"))){
                break;
            }
            int inte = Integer.valueOf(add);
            int cube = inte*inte*inte;
            
            
            System.out.println(cube);
        }
        

    }
}
