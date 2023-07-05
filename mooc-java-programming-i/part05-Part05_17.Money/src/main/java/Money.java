
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    
    public Money plus(Money addition){
        Money newMoney = new Money((euros() + addition.euros()), (cents()+ addition.cents()));
        return newMoney;  
    }
    
    
    public boolean lessThan(Money compared){
        if(euros()<compared.euros()){
            return true;
        } else{
            if(euros()==compared.euros()){
                if(cents()<compared.cents()){
                    return true;
                }
            }
        }
        return false;
    }

    
    
    public Money minus(Money decreaser){
        
        int euro = 0;
        int cent = 0;
        
        if(!(lessThan(decreaser))){
           euro = euros() - decreaser.euros();
           cent = cents()-decreaser.cents();
           if(cent<0){
               euro -= 1;
               cent += 100;
           }               
        }
        
        return new Money(euro,cent);
    }


}


