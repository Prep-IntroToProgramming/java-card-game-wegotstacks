import java.util.*;
public class Player{
    String name = "Arthur Morgan"; //I want this to be the default name
    Scanner input = new Scanner(System.in); //needed for chooseName()
    ArrayList<Card> hand = new  ArrayList<Card>(); //each player needs a hand
    void chooseName(){ //Bonus for chooseName method right?
        System.out.println("What is your name?");
        name = input.next();
        System.out.println("Hello "+name+", here are your cards!!");
    }
    void showHand(){//Shows the entirety of the player's hand starting from 0th
        for (Card s:hand){
            System.out.println("You ("+ name+") have "+s.rankToString());
        } //There's no point in saying the suit of cards, so we didn't for the whole game
    }
    void dealerHand(){ //want this for the grand reveal of dealer's hand at the end
        for (Card s:hand){
            System.out.println("Dealer has "+s.rankToString());
        } //Would use showHand(), but it says "You have" instead of "Dealer has"
    }
    void dShowHand(){ //needed to keep the dealer's first card hidden
        System.out.println("Dealer is hiding his first card");
        for (int i=1; i<hand.size(); i++){ //Starts with his second card
            Card s = hand.get(i);
            System.out.println("Dealer has "+hand.get(i).rankToString());
        }
    }

    void add(Card q){ //just how hitting happens, pretty self explanatory
        hand.add(q);
    }
    //originally had a score method to print out the handVal value for testing purposes
    int getScore(){ //need to have this in order to actually use the calculated score
        int handVal = 0;
        boolean acePresent = false;
        for (Card q: hand){
            if (q.rank >= 10) { //converts Jack,Queen, and King to value 10
                handVal = handVal+10;
            } else {
                handVal =  q.rank + handVal; //adds face value of number cards
            } 
            if (q.rank ==1){
                acePresent = true;
            }
        }
        if (handVal <=11 && acePresent){ //before, I had this in the for loop
            handVal = 10+handVal; //which meant that multiple Aces could add
        } //10 to handVal
        return handVal; //returns the score for the player/dealer
    }
    
}