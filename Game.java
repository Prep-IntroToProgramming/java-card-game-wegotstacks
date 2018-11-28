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
        System.out.println("Press 0 if you want to hold, 1 if you want to hit");
        int x=input.nextInt();
       // while (x==0 || x==1){
            if (x ==0){
                System.out.println("great! you stayed");
            } else if (x ==1){ 
                p.add(decko.draw());
            } else {
                System.out.println("YOU IDIOT PRESS 1 OR 0");

            }
        
    }
}