package Assignment;

public class Currency {
    double price;
    String unit;
    Currency(double price,String unit){
        this.price = price;
        this.unit = unit;
    }

    @Override
    public String toString() {
        return price+" "+unit;
    }
}
