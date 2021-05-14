package overWatch;

public class Lucio extends Hero{
    int speed,damage;
    Lucio(){
        super("lucio",80);
        this.speed = 100;
        this.damage = 40;
    }
    @Override
    void eSkill() {
        System.out.println(name+" 가 eSkill인 치유 증폭을 사용했습니다.");
    }

    @Override
    void move() {
        System.out.println(name+"(이)가"+speed+"의 속도로 이동합니다.");
    }

    @Override
    void attack(Hero hero) {
        int H = hero.HP;
        hero.HP -= damage;
        if(hero.HP < 0) hero.HP = 0;
        System.out.println(name+"(이)가"+hero.name+"을 공격해서 체력을"+H+"에서 "+hero.HP+"로 깎았습니다.");
    }

    @Override
    public String getDetailInfo() {
        return super.getDetailInfo()+"\n"+"speed: "+speed+"\n"+"damage: "+damage;
    }
}
