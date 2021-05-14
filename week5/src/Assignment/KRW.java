package Assignment;

public class KRW extends Currency{
    KRW(double price,String unit){
        super(price,unit);
    }

    @Override
    public String toString() {
        return "KRW : "+super.toString();
    }
}
