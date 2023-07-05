
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TextUI ui = new TextUI(new Scanner(System.in), new SimpleDictionary());
        ui.start();
    }
}
