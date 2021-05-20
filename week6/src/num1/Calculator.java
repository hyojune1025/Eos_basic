package num1;
interface Calculataable{
    void setOperands(int first, int second,int third);
    int sum();
    int avg();
}
public class Calculator implements Calculataable{
    int first,second,third;
    @Override
    public void setOperands(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    @Override
    public int sum() {
        return first + second + third;
    }

    @Override
    public int avg() {
        return sum()/3;
    }
}

class main{
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOperands(1,2,3);
        System.out.println(c1.sum());
        System.out.println(c1.avg());
    }
}