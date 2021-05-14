package Assignment;

public class USD extends Currency{
    USD(double price,String unit){
        super(price,unit);
    }

    @Override
    public String toString() {
        return "USD : "+super.toString();
    }
}
