import java.util.*;
public class TestDeck{ //This was made just to test and has obviously been in flux
    static void main(){ //No real comments aside from that everything works
        Deck Joker=new Deck();
        //System.out.println("Our first card is " + Joker.cards.get(0).rankToString());
        //Joker.draw();
        //System.out.println("Our first card is " + Joker.cards.get(0).rankToString());
        System.out.println(Joker.count());
        Joker.discard();
        Joker.showDeck();
        System.out.println(Joker.count());
        System.out.println("You randomly drew a "+Joker.randomDraw().rankToString());
    }
}