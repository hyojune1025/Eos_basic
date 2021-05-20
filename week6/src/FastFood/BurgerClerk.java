package FastFood;

public class BurgerClerk {
    public void orderBurger(BurgerCook bc){
        System.out.println("주방에 햄버거를 주문합니다.");
        bc.makeBurger();
    }

    public void orderSalad(BurgerCook bc){
        System.out.println("주방에 샐러드를 주문합니다.");
        bc.makeSalad();
    }
}
