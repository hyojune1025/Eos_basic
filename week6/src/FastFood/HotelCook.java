package FastFood;

public class HotelCook implements BurgerCook{
    @Override
    public void makeBurger() {
        System.out.println("호텔급 햄버거 만듦");
    }

    @Override
    public void makeSalad() {
        System.out.println("호텔급 샐러드 만듦");
    }
}
