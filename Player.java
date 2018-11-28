import java.util.*;
public class Player{
    String name = "Arthur Morgan";
    ArrayList<Card> hand = new  ArrayList<Card>();
    
    void showHand(){
        for (Card s:hand){
            System.out.println("You have "+s.rankToString());
        }
    }

    void add(Card q){
        hand.add(q);
    }

    
    /* void score(){
    int handVal = 0;
    boolean acePresent = false;
    for (Card q: hand){
    if (hand.(q).rank >= 10) {
    handVal = handVal+10;
    } else {
    handVal =  hand.get(q).rank + handVal;
    } if (hand.get(q).rank ==1){
    acePresent = true;
    }
    if (handVal <=11 && acePresent){
    handVal = 10+handVal;
    }
    }
    }
    /*static void main(){

    //System.out.println("You have "+ hand.);
    } */
}