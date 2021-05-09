import java.util.Scanner;

public class num2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        sc.close();
        System.out.println("반지름이 "+r+"인 원의 넓이는 "+r*r*3.14+"입니다.");
    }
}
