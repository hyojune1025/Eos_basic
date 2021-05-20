package Assignment01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("110-464-167257");
        int select = 0;
        Scanner sc = new Scanner(System.in);
        while (select != 4) {
            System.out.println("---------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("---------------------------------");
            System.out.print("선택>");
            select = sc.nextInt();
            switch (select){
                case 1:
                    System.out.print("예금액>");
                    account.deposit(sc.nextInt());
                    break;
                case 2:
                    System.out.print("출금액>");
                    account.withdraw(sc.nextInt());
                    break;
                case 3:
                    account.showBalance();
                    break;
                case 4:
                    System.out.println("프로그램 종료");
                    break;
                default:
                    System.out.println("입력 오류!");
                    break;
            }
        }
    }
}
