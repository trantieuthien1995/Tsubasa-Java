package Session08;

public class Baitap4 {
    public static void main(String[] args) {
        BankAccount accountA = new BankAccount();
        accountA.setAccountId("A001");
        accountA.setUserName("Nguyễn Văn A");
        accountA.setPhoneNumber("0123456789");
        accountA.setBalance(0);

        BankAccount accountB = new BankAccount();
        accountB.setAccountId("B001");
        accountB.setUserName("Nguyễn Văn B");
        accountB.setPhoneNumber("0987654321");
        accountB.setBalance(0);


        accountA.deposit(1000);


        double transferAmount = 300;
        accountA.withdraw(transferAmount);
        accountB.deposit(transferAmount);
        accountA.displayBalance();
        accountB.displayBalance();
    }
}
interface IBank{
    void deposit(double amount);
    void withdraw(double amount);
}
class  BankAccount implements IBank {
    String accountId;
    double balance;
    String userName;
    String phoneNumber;

    public void setAccountId(String newAccountId) {
        accountId = newAccountId;
    }

    public void setBalance(double newBalance) {
        balance = newBalance;
    }

    public void setUserName(String newUserName) {
        userName = newUserName;
    }

    public void setPhoneNumber(String newPhone) {
        phoneNumber = newPhone;
    }
    @Override
    public void deposit(double amount){
        if (amount > 0) {
            balance += amount;
            System.out.println(userName + " nạp " + amount + " thành công.");
        } else {
            System.out.println("Số tiền gửi phải lớn hơn 0.");
        }
    }
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(userName + " rút " + amount + " thành công." );
        } else if (amount > balance) {
            System.out.println("Không đủ số dư để rút.");
        } else {
            System.out.println("Số tiền rút phải lớn hơn 0.");
        }
    }
    public void displayBalance() {
        System.out.println("Tài khoản: " + accountId + ", Chủ tài khoản: " + userName + ", Số dư: " + balance);
    }

}

