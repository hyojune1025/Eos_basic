public class num1 {
    public static double getTotal(int cost,int year){
        for(int i=0;i<year;++i){
            cost *=1.045;
        }
        return cost;
    }
    public static void main(String[] args) {
        System.out.println(getTotal(10000,4));
    }
}
