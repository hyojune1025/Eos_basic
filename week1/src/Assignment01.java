import java.util.Scanner;

public class Assignment01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("학번을 입력해주세요: ");
        long studentNum = sc.nextLong();
        System.out.print("이름을 입력해주세요: ");
        String name = sc.next();
        System.out.print("전화번호를 입력해주세요: ");
        String phone = sc.next();
        System.out.println("학번:"+studentNum+"\n이름: "+name+"\n전화번호: "+phone);
    }
}
