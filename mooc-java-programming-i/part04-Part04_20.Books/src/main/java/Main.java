import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Books> bookList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        
        while(true){
            System.out.println("Title:");
            String title = scan.nextLine();
            
            if (title.isEmpty()){
                break;
            }
            
            System.out.println("Pages:");
            int pages = Integer.valueOf(scan.nextLine());
            
            System.out.println("Publication year:");
            int year = Integer.valueOf(scan.nextLine());
            
            bookList.add(new Books(title, pages, year));
            
        }
        
        System.out.println("What information will be printed?");
        String info = scan.nextLine();
        
        for (Books book : bookList){
            if (info.equals("everything")){
                System.out.println(book.getTitle() + ", " + book.getPages()  + " pages, " + book.getYear());
            } else if (info.equals("name")){
                System.out.println(book.getTitle());
            }     
        }
        

    }
}
