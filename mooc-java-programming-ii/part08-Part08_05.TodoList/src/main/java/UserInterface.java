
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sakch
 */
public class UserInterface {
    private TodoList taskList;
    private Scanner scan;

    public UserInterface(TodoList taskList, Scanner scan) {
        this.taskList = taskList;
        this.scan = scan;
    }
    
    public void start(){
        while(true){
            
            
            System.out.println("Command: ");
            String command = scan.nextLine();
            
            if(command.equals("stop")){
                break;
            }
            
            if(command.equals("add")){
                System.out.println("To add: ");
                String task = scan.nextLine();
                this.taskList.add(task);                
            }
            
            if(command.equals("list")){
                this.taskList.print();
            }
            
            if(command.equals("remove")){
                System.out.println("Which one is removed?");
                int index = Integer.parseInt(scan.nextLine());
                this.taskList.remove(index);
            }
            
        }
    }
    
}
