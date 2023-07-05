
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        HashMap<String, String> nicknames = new HashMap<>();
        nicknames.put("mathew", "matt");
        nicknames.put("michael", "mix");
        nicknames.put("arthur", "artie");
        
        String name = nicknames.get("matthew");
        System.out.println(name);
        
    }

}
