package week3;

public class BankAccount {
   private String accountNo;
   private String ownerName;
   private double balance;
   private int pin;
   
    public BankAccount(String accountNo, String ownerName, double balance, int pin) {
    this.accountNo = accountNo;
    this.ownerName = ownerName;
    this.balance = balance;
    this.pin = pin;
}

   
   public boolean AuthAccount(String accountNo, int pin) {
    return this.accountNo.equals(accountNo) && this.pin == pin;
}
    

   

   public String getAccountNo() {
        return accountNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {//��าร��า����ะ����ะ
        if(amount <= 0){
            System.out.println("Deposit amount must be greater than 0.");
        } else {
            balance += amount;
            System.out.println("Deposit successful: " + amount + " Baht");
        }
    }

    public void withdraw(double amount) {//��ารถอ����ะ����ะ
        if(amount <= 0){
            System.out.println("Withdrawal amount must be greater than 0.");
        }else if (amount > balance) {
            System.out.println("Insufficient balance.");
        }else{
            balance -= amount;
            System.out.println("Withdrawal successful: " + amount + " Baht");
        }
    }

    public void showInfo() {
        System.out.println("Account Number : " + accountNo);
        System.out.println("Account Holder : " + ownerName);
        System.out.println("Balance        : " + balance + " Baht");
    }
}