import java.util.Random;

public class Participant {
    private String name;
    private Card card;
    private int point;
    Random rand = new Random();
    public Participant(String name){
        this.name = name;
        card = new Card(rand.nextInt(4),rand.nextInt(13) + 1);
        point = 0;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getPoint() { return point; }
    public void setPoint(int point) { this.point = point; }
    public Card getCard() { return card; }
    public void setCard(Card card) { this.card = new Card(card); }

    public void addPoint(int point){
        this.point += point;
    }
    public void changeCard(){
        card = new Card(rand.nextInt(4),rand.nextInt(13) + 1);
    }
    public String toString(){
        return name+" has "+card.toString()+"(point:"+getPoint()+")";
    }
}
