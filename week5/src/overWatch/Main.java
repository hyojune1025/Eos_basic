package overWatch;

public class Main {
    public static void main(String[] args) {
        Lucio lucio = new Lucio();
        Hanzo hanzo = new Hanzo();

        hanzo.move();
        hanzo.eSkill();
        System.out.println(hanzo.getDetailInfo());

        lucio.move();
        lucio.eSkill();
        System.out.println(lucio.getDetailInfo());

        hanzo.attack(lucio);
        lucio.attack(hanzo);

        System.out.println(hanzo.getDetailInfo());
        System.out.println(lucio.getDetailInfo());

    }
}
