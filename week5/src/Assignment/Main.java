package Assignment;

public class Main {
    public static void main(String[] args) {
        KRW krw = new KRW(1500,"원");
        USD usd = new USD(100.5,"달러");
        EUR eur = new EUR(260.87,"유로");
        JPY jpy = new JPY(1400,"엔");

        Currency[] currencies = {krw,usd,eur,jpy};
        for(Currency c : currencies)
            System.out.println(c.toString());
    }
}
