/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sakch
 */
public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString() {
        return "The card has a balance of " + balance + " euros";
    }
    
    public void eatAffordably() {
        if (balance>=2.60){
            balance -= 2.60;
        }    
    }

    public void eatHeartily() {
        if(balance>=4.60) {
            balance -= 4.60;
        }
    }
    
    public void addMoney(double amount){
        if(amount<0){
            return;
        }
        else if ((balance+amount) <=150){
            balance += amount;  
        } else {
            double remainder = 150 - balance;
            amount -= remainder;
            balance += remainder;
        }       
    }

    
    
    
}
