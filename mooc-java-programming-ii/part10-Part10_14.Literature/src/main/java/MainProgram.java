
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        while(true){
            System.out.println("Input the name of the book, empty stops:");
            String book = scanner.nextLine();
            if(book.isEmpty()){
                end(books);
                break;
            }
            System.out.println("Input the age recommendation");
            int age = Integer.valueOf(scanner.nextLine());
            System.out.println("");
            books.add(new Book(book, age));
        }
    }    
    
    public static void end(ArrayList<Book> books){
        System.out.println(books.size() + " books in total.");
        System.out.println("\nBooks: ");
        
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAge)
                .thenComparing(Book::getName);
        
        Collections.sort(books, comparator);
        
        for(Book book : books){
            System.out.println(book);
        }
    }
}
