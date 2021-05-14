package Assignment;

public class EUR extends Currency{
    EUR(double price,String unit){
        super(price, unit);
    }

    @Override
    public String toString() {
        return "EUR : "+super.toString();
    }
}
