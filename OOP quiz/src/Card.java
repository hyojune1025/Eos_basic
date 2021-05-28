public class Card {
    private int symbol;
    private int number;

    public Card(int symbol, int number){
        this.symbol = symbol;
        this.number = number;
    }
    public Card(Card aCard){
        this.symbol = aCard.getSymbol();
        this.number = aCard.getNumber();
    }

    public int getSymbol() {
        return symbol;
    }

    public int getNumber() {
        return number;
    }

    public void setSymbol(int symbol) {
        this.symbol = symbol;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public boolean equals(Card anotherCard) {
        if (anotherCard == null) return false;
        else {
            return this.getSymbol() == anotherCard.getSymbol() &&
                    this.getNumber() == anotherCard.getNumber();
        }
    }
    public String toString(){
        String string = "";
        switch (symbol){
            case 0:
                string+="Clubs";
                break;
            case 1:
                string+= "Diamonds";
                break;
            case 2:
                string+= "Hearts";
                break;
            case 3:
                string+="Spades";
                break;
        }
        return string+", "+getNumber();
    }
    public static int compareCard(Card cardA, Card cardB){
        if(cardA.getNumber() == cardB.getNumber()) return 0;
        else{
            return cardA.getNumber()> cardB.getNumber()? -1:1;
        }
    }
}
