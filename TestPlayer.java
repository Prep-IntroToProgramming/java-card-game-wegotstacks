import java.util.*;
public class TestPlayer{
    static void main(){
        Game g =new Game();
        g.decko.shuffle();
        g.deal();
        g.p.showHand();
        //g.d.showHand();
        //System.out.println(p.name);
        g.choice();
        g.p.showHand();
    } 
    

    static void showHand(){
        ArrayList<Card> hand = new  ArrayList<Card>();
        
        for (Card s:hand){
            System.out.println("You have "+s.rankToString());
        }
    }
}