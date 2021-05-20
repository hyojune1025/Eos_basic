package Assignment02;

public class Knight implements Tanker{
    String name;
    int hp = 0;
    int armor = 0;

    @Override
    public void increaseHp() {
        hp+=100;
        System.out.println("increaseHp() 시전!");
        System.out.println("\t체력이 +100 증가합니다.");
    }

    @Override
    public void increaseArmor() {
        armor+=5;
        System.out.println("increaseArmor() 시전!");
        System.out.println("\t아머가 +5 증가합니다.");
    }
}

interface Tanker{
    public void increaseArmor();
    public void increaseHp();
}
