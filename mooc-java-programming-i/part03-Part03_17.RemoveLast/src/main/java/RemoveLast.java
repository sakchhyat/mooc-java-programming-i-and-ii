
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
    }
    
    public static void removeLast(ArrayList<Integer> numbers) {
    if (numbers.size() == 0) {
        return;
    }

    numbers.remove(numbers.remove(numbers.size()-1));
}

}
