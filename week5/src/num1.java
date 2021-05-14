public class num1 {
    public static void main(String[] args) {
        Lotto lotto = new Lotto();
        lotto.setPercentage(-40);
        System.out.println(lotto.getPercentage());
    }
}
final class Lotto{
    private float percentage;

    public float getPercentage(){
        return percentage;
    }

    public void setPercentage(float percentage) {
        if(percentage > 100) this.percentage = 100;
        else if(percentage < 0) this.percentage = 0;
        else this.percentage = percentage;
    }
}
