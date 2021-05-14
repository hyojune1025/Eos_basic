package overWatch;

public abstract class Hero {
    String name;
    int HP;
    public Hero(String name, int HP){
        this.name = name;
        this.HP = HP;
        System.out.println(name+"(이)가 생성되었습니다.");
    }
    abstract void eSkill();
    abstract void move();
    public String getDetailInfo(){
        return "이름: "+name+"\n HP: "+HP;
    }
    abstract void attack(Hero hero);
}
