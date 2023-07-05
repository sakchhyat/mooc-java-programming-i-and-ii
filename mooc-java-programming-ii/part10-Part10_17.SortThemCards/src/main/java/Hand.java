
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sakch
 */
public class Hand implements Comparable<Hand>{
    private ArrayList<Card> hand;
    
    public Hand(){
        this.hand = new ArrayList<>();       
    }
    
    public void add(Card card){
        this.hand.add(card);
    }
    
    public void sort(){
        Collections.sort(this.hand, (c1, c2) -> c1.compareTo(c2));
    }
    
    public void print(){
        Iterator<Card> iterator = hand.iterator();
        
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


    @Override
    public int compareTo(Hand o) {
        int sumThisHand = 0;
        int sumHandO = 0;
        
        for(Card card: this.hand){
            sumThisHand += card.getValue();
        }
        
        for(Card card: o.hand){
            sumHandO += card.getValue();
        }
        
        return sumThisHand - sumHandO;
    }
    
    public void sortBySuit(){
        Collections.sort(this.hand, new BySuitInValueOrder());
    }
    
}
