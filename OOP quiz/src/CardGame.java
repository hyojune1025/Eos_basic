import java.util.Random;
import java.util.Scanner;

public class CardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Player Name: ");
        Participant participant = new Participant(sc.nextLine());
        Participant dealer = new Participant("Dealer");
        for(int i=0;i<3;++i){
            System.out.println("-------------------");
            System.out.println(dealer);
            System.out.println(participant);
            System.out.println("-------------------");
            int comp = Card.compareCard(dealer.getCard(), participant.getCard());
            if(comp == -1) dealer.addPoint(1);
            else if(comp == 1) participant.addPoint(1);
            participant.setCard(dealer.getCard());
            dealer.changeCard();
        }
        System.out.println(participant.getName()+", "+participant.getPoint()+" points");
        Random rand = new Random();
    }
}
