import java.util.*;
class Deck{
    ArrayList<Card> cards = new ArrayList<Card>();
    Deck(){
        for (int i = 1; i<5; i++){
            for (int r = 1; r<=13; r++){               
                cards.add(new Card(r,i));
            }
        }
    }
    Card draw(){ 
        Card draWed = cards.get(0); //remembers the card that gets removed
        cards.remove(0);
        return draWed;
    }
    void shuffle(){
        Collections.shuffle(cards); //the shuffle method is part of java.util.*
    }
    int count(){
        return cards.size();
    }
    void discard(){ //just removes a card and forgets about it
        cards.remove(0);
    }
    Card randomDraw(){ //this is for the bonus
        int x = (int) (Math.random()*cards.size());
        Card draWed = cards.get(x);
        cards.remove(x);
        return draWed;
    }
}