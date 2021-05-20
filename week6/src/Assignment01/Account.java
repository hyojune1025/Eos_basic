package Assignment01;

public class Account implements interface_account{
    private String accountNo;
    private int balance;
    Account(String accountNo){
        this.accountNo = accountNo;
    }

    @Override
    public void deposit(int money) {
        balance += money;
    }

    @Override
    public void withdraw(int money) {
        if(balance - money < 0){
            System.out.println("잔고 부족!");
        }else{
            balance -= money;
        }

    }

    @Override
    public void showBalance() {
        System.out.println("계좌번호: "+accountNo);
        System.out.println("잔액: "+balance);
    }
}
