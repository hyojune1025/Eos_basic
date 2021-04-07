import java.util.Scanner;

public class star_5_to_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //5
        for(int i=0;i<n;++i){
            for(int j=0;j<(n-1)-i;++j){
                System.out.print(" ");
            }
            for(int j=0;j<i*2+1;++j){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        //6
        for(int i=0;i<n;++i){
            for(int j=0;j<i;++j){
                System.out.print(" ");
            }
            for(int j=0;j<(n*2-1)-i*2;++j){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
