public class ass1 {
    public static void main(String[] args){
        System.out.println("=== 인생은 역시 한방! 로또 번호 자동생성기 ===");
        int[] lotto = new int[6];
        for(int i=0;i<6;++i){
            lotto[i] = (int)(Math.random()*45 + 1);
            for(int j=0;j<i;++j){
                if(lotto[i] == lotto[j]) {
                    lotto[i] = (int) (Math.random() * 45 + 1);
                    j = 0;
                }
            }
        }
        for(int i:lotto) System.out.print(i+"\t");
        System.out.println("\n"+"실망하지마세요. 보너스 번호가 있으니까요!");
        System.out.print("보너스 번호 : ");
        int a = (int)(Math.random()*45 + 1);
        for(int i=0;i<6;++i){
            if(lotto[i] == a){
                a = (int)(Math.random()*45 + 1);
                i = 0;
            }
        }
        System.out.println(a);
    }
}
