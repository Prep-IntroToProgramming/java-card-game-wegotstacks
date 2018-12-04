import java.util.*;
public class Game{
    Deck decko= new Deck();
    Player p = new Player();
    Player d = new Player();
    Scanner input = new Scanner(System.in);
    void deal(){
        p.add(decko.draw());
        d.add(decko.draw());
        p.add(decko.draw());
        d.add(decko.draw());
    }   

    void choice(){
        if (p.getScore()>21){
            return;
        }
        System.out.println("Press 0 if you want to hold, 1 if you want to hit");

        while (!input.hasNextInt()){
            System.out.println("TYPE AN INTEGER U COTTON-HEADED NINNY MUGGINS");

            input.nextLine();
        }
        int x=input.nextInt();
        // while (x==0 || x==1){
        if (x ==0){
            System.out.println("great! you stayed");
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

        while (d.getScore()<=16){
            d.dScore();
            Card drawn = decko.draw();
            d.add(drawn);
            System.out.println("Dealer drew a "+drawn.rankToString());
        }
        System.out.println("Dealer has "+d.getScore()+" points");

    }

    void winner(){
        if (p.getScore()>d.getScore() && p.getScore()<=21){
            System.out.println("You ("+p.name+") won because your score was higher!!");
        } else if(d.getScore()>21 && p.getScore()<=21) {
            System.out.println("You ("+p.name+") won because the dealer busted!!");
        } else if(p.getScore()>21){
            System.out.println("Shucks, the dealer won because you busted!!");
        } else if(p.getScore()<d.getScore()){
            System.out.println("Shucks, the dealer won because you had less!!");
        } else if (p.getScore()==d.getScore()){
            System.out.println("Shucks, the dealer won because you tied!!");
        }

    }

}