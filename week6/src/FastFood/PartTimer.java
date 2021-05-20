package FastFood;

public class PartTimer implements BurgerCook{
    @Override
    public void makeBurger(){
        System.out.println("아르바이트급 햄버거 만듦");
    }

    @Override
    public void makeSalad(){
        System.out.println("아르바이트급 샐러드 만듦");
    }
}
