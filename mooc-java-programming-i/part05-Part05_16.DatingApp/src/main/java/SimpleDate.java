
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    
    
    

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public void advance(){
        if (this.day<30){
            this.day += 1;
        } else {
            this.day = 1;
            if(this.month<12){
                this.month += 1;
            }
            else{
                this.month = 1;
                this.year += 1;
            }
        }        
    }
    
    public void advance(int howManyDays){
        for (int i=0; i<howManyDays; i++){
            advance();
        }
    }
    
    public SimpleDate afterNumberOfDays(int days){
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        
       
        for (int i=0; i<days; i++){
            newDate.advance();
        }
 
    
            
        return newDate;
 
    }
}
    
    
    


