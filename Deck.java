import java.util.*;
class Deck{
    ArrayList<Card> cards = new ArrayList<Card>();
    Deck(){
        for (int i = 1; i<5; i++){
            for (int r = 1; r<=13; r++){               
                cards.add(new Card(r,i));
                //System.out.println(Card.rankToString(r)+" of "+Card.suitToString(i));
            }
        }
    }
    Card draw(){
        Card draWed = cards.get(0);
        cards.remove(0);
        return draWed;
    }
    void shuffle(){
        Collections.shuffle(cards);
    }
    int count(){
        return cards.size();
    }
    void discard(){
        //Card draWed = cards.get(0);
        cards.remove(0);
        //return draWed;
    }
    Card randomDraw(){
        int x = (int) (Math.random()*cards.size());
        Card draWed = cards.get(x);
        cards.remove(x);
        return draWed;
    }
}