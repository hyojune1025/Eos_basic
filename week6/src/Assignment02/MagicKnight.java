package Assignment02;

public class MagicKnight extends Knight implements Sorcerer{
    MagicKnight(String name,int hp, int armor){
        this.name = name;
        this.hp = hp;
        this.armor = armor;
    }

    @Override
    public void fireArmor() {
        System.out.print("["+name+"] ");
        System.out.println("fireArmor() 시전!");
        System.out.println("\t주변 적에게 초당 +10의 데미지를 줍니다,");
    }

    @Override
    public void thunderBlade() {
        System.out.print("["+name+"] ");
        System.out.println("thunderBlade() 시전!");
        System.out.println("\t매 공격시 +10의 추가 데미지를 줍니다.");
    }

    @Override
    public void increaseHp() {
        System.out.print("["+name+"] ");
        super.increaseHp();
    }

    @Override
    public void increaseArmor() {
        System.out.print("["+name+"] ");
        super.increaseArmor();
    }
}

interface Sorcerer{
    void fireArmor();
    void thunderBlade();
}
