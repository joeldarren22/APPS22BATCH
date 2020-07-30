public class WithDrawThread implements Runnable {
private Account account;
private double amount;
public WithDrawThread(Account account, double amount) {
this.account = account;
this.amount = amount;
}
public void run() {
//make a withdraw
account.withdraw(amount);
}
}//end WithdrawThread class
