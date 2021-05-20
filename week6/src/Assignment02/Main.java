package Assignment02;

public class Main {
    public static void main(String[] args) {
        Knight uther = new HolyKnight("우서",200,10);
        Knight arthas = new MagicKnight("아서스",150,8);

        uther.increaseHp();
        uther.increaseArmor();

        HolyKnight holyUther = (HolyKnight) uther;
        holyUther.healingAura();
        holyUther.holyArmor();

        arthas.increaseHp();
        arthas.increaseArmor();

        MagicKnight magicKnight = (MagicKnight) arthas;
        magicKnight.fireArmor();
        magicKnight.thunderBlade();

    }
}
