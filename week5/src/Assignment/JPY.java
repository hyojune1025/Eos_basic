package Assignment;

public class JPY extends Currency{
    JPY(double price,String unit){
        super(price, unit);
    }

    @Override
    public String toString() {
        return "JPY : "+super.toString();
    }
}
