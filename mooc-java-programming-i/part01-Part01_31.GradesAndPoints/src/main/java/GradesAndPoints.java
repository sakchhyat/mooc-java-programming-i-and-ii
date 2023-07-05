
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scan.nextLine());
        String grade = "";
        
        if (first<0) {
            grade = "Impossible!";
        } else if (first<50){
            grade = "failed";
        } else if (first<60){
            grade = "1";
        } else if (first<70){
            grade = "2";
        } else if (first<80){
            grade = "3";
        } else if (first<90){
            grade = "4";
        } else if (first<=100){
            grade = "5";
        } else if (first>100){
            grade = "incredible";
        }
        
        System.out.println("Grade: "+ grade);
        
        
        

    }
}
