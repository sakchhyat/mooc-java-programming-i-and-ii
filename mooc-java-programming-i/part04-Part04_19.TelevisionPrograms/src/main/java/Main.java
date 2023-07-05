import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("Name: ");
            String name = scanner.nextLine();
            
            if (name.isBlank()){
                break;
            }
            
            System.out.println("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());
            
            programs.add(new TelevisionProgram(name, duration));
            
            
            
        }
        
        System.out.println("Program's maximum duration?");
        int reqDuration = Integer.valueOf(scanner.nextLine());
        
        
        
        
        for (TelevisionProgram program : programs){
            
            int duration = program.getDuration();
            if (duration<=reqDuration){
                System.out.println(program.getName() + ", " + duration + " minutes");
            }
        }
        

    }
}
