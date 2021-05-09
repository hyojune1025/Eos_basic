import java.util.Scanner;

public class ass2 {
    public static int sumDigitsByStr(int n){
        String number = Integer.toString(n);
        int sum = 0;
        for(int i=0;i<number.length();++i){
            sum+=Integer.parseInt(number.substring(i,i+1));
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumDigitsByStr(n));
    }
}
