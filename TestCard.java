
public class TestCard{
    public static void main(){
        int testRank = Card.KING;
        int testSuit = Card.CLUBS;       
        Card AofH = new Card(testRank,testSuit);
        if (AofH.rank==testRank && AofH.suit==testSuit){
            System.out.println("Yup, that's what it should be!!!!!");
        } else{
            System.out.println("Something's not right...");
        }
        //System.out.println(AofH.rank + " "+ AofH.suit);
        System.out.println(AofH.rankToString(AofH.rank)+" of "+AofH.SuitToString(AofH.suit));        
    }
    public static void Deck(){
        int testRank = 1;
        int testSuit = 1; 
    }
}
