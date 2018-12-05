import java.util.*;
public class PlayBlackJack{
    static void main(){
        Game g =new Game();
        g.decko.shuffle();
        g.p.chooseName(); //bonus
        g.deal();
        g.p.showHand();
        g.d.dShowHand();
        g.choice(); //player has to go before the dealer
        //g.p.score();
        g.dealerPlay(); 
        g.d.dealerHand();
        g.winner(); //checks at the end to see who wins (why it's named winner)
    } 
}