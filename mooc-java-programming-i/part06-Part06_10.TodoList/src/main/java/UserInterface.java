
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
    private TodoList todos;
    private Scanner scan;

    public UserInterface(TodoList todos, Scanner scan) {
        this.todos = todos;
        this.scan = scan;
    }

    
    public void start(){
        while(true){
            System.out.println("Command: ");
            String command = this.scan.nextLine();
            if(command.equals("stop")){
                break;
            } else if(command.equals("add")){
                System.out.println("To add: ");
                String task = this.scan.nextLine();
                this.todos.add(task);
            } else if(command.equals("list")){
                this.todos.print();
            } else if(command.equals("remove")){
                System.out.println("Which one is removed? ");
                int indexTodo = Integer.valueOf(this.scan.nextLine());
                this.todos.remove(indexTodo);
            }
        }
    }
    
    
}
