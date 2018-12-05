import java.util.*;
public class Game{
    Deck decko= new Deck();
    Player p = new Player();
    Player d = new Player(); //made our dealer a player because they use similar methods
    Scanner input = new Scanner(System.in); //needed for the choice method
    void deal(){ //had to put them in alternating order because that's how dealing works
        p.add(decko.draw());
        d.add(decko.draw());
        p.add(decko.draw());
        d.add(decko.draw());
    }   

    void choice(){
        if (p.getScore()>21){ //this way if they bust, they can't keep hitting
            return;
        }
        System.out.println("Press 0 if you want to hold, 1 if you want to hit");
        while (!input.hasNextInt()){ //checks to make sure input is an integer
            System.out.println("TYPE AN INTEGER U COTTON-HEADED NINNY MUGGINS");
            input.nextLine(); //waits for the next input
        }
        int x=input.nextInt(); 

        if (x ==0){
            System.out.println("Great! You stayed");
            p.showHand();
        } else if (x ==1){ 
            p.add(decko.draw());
            p.showHand();
            choice();
        } else {
            System.out.println("YOU IDIOT PRESS 1 OR 0");
            choice();
        }

    }

    void dealerPlay(){

        while (d.getScore()<=16){ //dealer automatically draws when score is less than 17
            Card drawn = decko.draw();
            d.add(drawn);
            System.out.println("Dealer drew a "+drawn.rankToString());
        }

    }

    void checkForBlackJack(){
        if (d.getScore()==21){
            System.out.println("Dealer wins!!");
        }
    }
    
    void winner(){
        if (p.getScore()>d.getScore() && p.getScore()<=21){ 
            System.out.println("You ("+p.name+") won because your score was higher!!");
        } else if(d.getScore()>21 && p.getScore()<=21) { //if dealer busts and player doesn't
            System.out.println("You ("+p.name+") won because the dealer busted!!");
        } else if(p.getScore()>21){
            System.out.println("Shucks, the dealer won because you busted!!");
        } else if(p.getScore()<d.getScore()){ 
            System.out.println("Shucks, the dealer won because you had less!!");
        } else if (p.getScore()==d.getScore()){ //dealer wins if they tie
            System.out.println("Shucks, the dealer won because you tied!!");
        }

    }

}