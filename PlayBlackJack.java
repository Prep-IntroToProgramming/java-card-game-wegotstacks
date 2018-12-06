import java.util.*;
public class PlayBlackJack{
    static void main(){
        Game g =new Game();
        g.decko.shuffle(); //need to shuffle the deck
        g.p.chooseName(); //bonus
        g.deal();
        g.p.showHand();
        g.d.dShowHand();
        g.choice(); //player has to go before the dealer
        g.dealerPlay(); //dealer will still "go" after the player busts to show the player what would have happened if they'd stayed
        g.d.dealerHand(); 
        g.winner(); //checks at the end to see who wins (why it's named winner)
    } 
}