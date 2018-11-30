import java.util.*;
public class Player{
    String name = "Arthur Morgan";
    ArrayList<Card> hand = new  ArrayList<Card>();

    void showHand(){
        for (Card s:hand){
            System.out.println("You have "+s.rankToString());
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
            } if (q.rank ==1){
                acePresent = true;
            }
            if (handVal <=11 && acePresent){
                handVal = 10+handVal;
            }
        }
        System.out.println("You have "+handVal+" points");
    }
    int getScore(){
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
            if (handVal <=11 && acePresent){
                handVal = 10+handVal;
            }
        }
        return handVal;
    }
    void dealerPlay(){
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
    }
}