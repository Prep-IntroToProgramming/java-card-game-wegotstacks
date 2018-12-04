import java.util.*;
public class Player{
    String name = "Arthur Morgan";
    Scanner input = new Scanner(System.in);
    ArrayList<Card> hand = new  ArrayList<Card>();
    void chooseName(){
        System.out.println("What is your name?");
        name = input.next();
        System.out.println("Hello "+name+", here are your cards!!");
    }
    void showHand(){
        for (Card s:hand){
            System.out.println("You ("+ name+") have "+s.rankToString());
        }
    }
    
    void dShowHand(){
        System.out.println("Dealer is hiding his first card");
        for (int i=1; i<hand.size(); i++){
            Card s = hand.get(i);
            System.out.println("Dealer has "+hand.get(i).rankToString());
        }
    }
    
    void dealerHand(){
        for (Card s:hand){
            System.out.println("Dealer has "+s.rankToString());
        }
    }

    void add(Card q){
        hand.add(q);
    }

    void score(){
        int handVal = 0;
        boolean acePresent = false;
        for (Card q: hand){
            if (q.rank >= 10) {
                handVal = handVal+10;
            } else {
                handVal =  q.rank + handVal;
            }
            if (q.rank ==1){
                acePresent = true;
            }

        }
        if (handVal <=11 && acePresent){
            handVal = 10+handVal;
        }
        System.out.println("You have "+handVal+" points");
    }

    void dScore(){
        int handVal = 0;
        boolean acePresent = false;
        for (Card q: hand){
            if (q.rank >= 10) {
                handVal = handVal+10;
            } else {
                handVal =  q.rank + handVal;
            } if (q.rank ==1){
                acePresent = true;
            }
            
        }
        if (handVal <=11 && acePresent){
                handVal = 10+handVal;
            }
        System.out.println("Dealer has "+handVal+" points");
    }

    int getScore(){
        int handVal = 0;
        boolean acePresent = false;
        for (Card q: hand){
            if (q.rank >= 10) {
                handVal = handVal+10;
            } else {
                handVal =  q.rank + handVal;
            } 
            if (q.rank ==1){
                acePresent = true;
            }
        }
        if (handVal <=11 && acePresent){
            handVal = 10+handVal;
        }
        return handVal;
    }
    /*void dealerPlay(){
    int handVal = 0;
    boolean acePresent = false;
    while (handVal<22){
    for (Card q: hand){
    if (q.rank >= 10) {
    handVal = handVal+10;
    } else {
    handVal =  q.rank + handVal;
    } if (q.rank ==1){
    acePresent = true;
    }
    if (handVal <=11 && acePresent){
    handVal = 10+handVal;
    }
    }

    }
    } */
}