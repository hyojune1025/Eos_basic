package Assignment02;

public class HolyKnight extends Knight implements Healer{
    HolyKnight(String name,int hp,int armor){
        this.name = name;
        this.hp = hp;
        this.armor = armor;
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

    @Override
    public void healingAura() {
        System.out.print("["+name+"] ");
        System.out.println("healingAura() 시전!");
        System.out.println("\t초당 체력회복이 +10 증가합니다");
    }

    @Override
    public void holyArmor(){
        System.out.print("["+name+"] ");
        System.out.println("holyArmor() 시전!");
        System.out.println("\t데미지를 -10 덜 받습니다.");
    }
}

interface Healer{
    void healingAura();
    void holyArmor();
}
