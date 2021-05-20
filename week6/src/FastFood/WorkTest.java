package FastFood;

public class WorkTest {
    public static void main(String[] args) {
        BurgerCook hcook = new HotelCook();
        BurgerCook pcook = new PartTimer();
        BurgerClerk bk = new BurgerClerk();

        System.out.println("호텔식 햄버거 주문요청 들어옴");
        bk.orderBurger(hcook);

        System.out.println("알바식 샐러드 주문요청 들어옴");
        bk.orderSalad(pcook);

        System.out.println("알바식 햄버거 주문요청 들어옴");
        bk.orderBurger(pcook);

        System.out.println("호텔식 샐러드 주문요청 들어옴");
        bk.orderSalad(hcook);
    }
}
