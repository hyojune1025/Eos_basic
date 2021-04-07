import java.util.Scanner;

public class star_7_to_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // height == n*2-1
        //7
        for(int i=0;i<n;++i){
            for(int j=0;j<(n-1)-i;++j){
                System.out.print(" ");
            }
            for(int j=0;j<i*2+1;++j){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<(n-1);++i){
            for(int j=0;j<=i;++j){
                System.out.print(" ");
            }
            for(int j=0;j<((n-1)*2-1)-2*i;++j){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        //8
        for(int i=0;i<n;++i){
            for(int j=0;j<i;++j){
                System.out.print(" ");
            }
            for(int j=0;j<(n*2-1)-2*i;++j){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<(n-1);++i){
            for(int j=0;j<(n-2)-i;++j){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1+2;++j){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
