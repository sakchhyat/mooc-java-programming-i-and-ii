

public class Checker {

    
    public boolean isDayOfWeek(String string){
        if(string.matches("mon|tue|wed|thu|fri|sat|sun")){
            System.out.println("The form is correct.");
            return true;
        }else{
            System.out.println("The form is incorrect.");
            return false;
        }
    }
    
    public boolean timeOfDay(String string){
        if(string.matches("([01][0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9])")){
            System.out.println("The form is correct.");
            return true;
        }else{
            System.out.println("The form is incorrect.");
            return false;
        }
    }
    
    public boolean allVowels(String string){
        
        String[] strin = string.split("");
    
        for(String stri : strin){
            if(stri.matches("a|e|i|o|u")){
                System.out.println("The form is correct.");
                continue;
            }else{
                System.out.println("The form is incorrect.");
                return false;
            }
        }
        return true;
    }

}
     
         