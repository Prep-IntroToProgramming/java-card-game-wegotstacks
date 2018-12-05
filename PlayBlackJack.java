import java.util.*;
public class PlayBlackJack{
    static void main(){
        Game g =new Game();
        g.decko.shuffle();
        g.p.chooseName();
        g.deal();
        g.p.showHand();
        g.d.dShowHand();
        g.choice();
        g.p.score();
        g.dealerPlay();
        g.d.dealerHand();
        g.winner();
    } 

    static void showHand(){
        ArrayList<Card> hand = new  ArrayList<Card>();
        for (Card s:hand){
            System.out.println("You have "+s.rankToString());
        }
    }
}