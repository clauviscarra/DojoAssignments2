import java.lang.Math;


public class BankAccount {
	
	private long account_number;
	private long checking_balance;
	private long savings_balance;
	private static int numberOfAccounts = 0;
	private static long amountOfMoney = 0;
	

	
	public BankAccount(){
		this.account_number = (int)(Math.random() * 1000000000 + 1000000009);
		this.checking_balance = 0;
		this.savings_balance = 0;
		numberOfAccounts++;
		amountOfMoney = checking_balance + savings_balance;
	}
	
	public void addToSavings(long savings){
		this.savings_balance += savings;
		amountOfMoney = this.checking_balance + this.savings_balance;
		
		System.out.println("You have added $" + savings + " to your savings account. Your total savings are now $" + savings_balance + ". Your total amount of money is $" + amountOfMoney);	
		
	}
	
	public void addToChecking(long checking){
		this.checking_balance += checking;
		amountOfMoney = this.checking_balance + this.savings_balance;
		
		System.out.println("You have added $" + checking + " to your checking account. Your total checking are now $" + checking_balance + ". Your total amount of money is $" + amountOfMoney);	
		
	}
	
	public long setAccountNumber(long account_number){
		return account_number;
		
	}
	
	public long getAccountNumber(){
		System.out.println(account_number);
		return account_number;
	}
	
	public static long accountCount(){
		return numberOfAccounts;
	}
	
	public void setCheckingBalance(long checking_balance){
		this.checking_balance = checking_balance;
	}
	
	public long getCheckingBalance(){
		System.out.println("You have $" + checking_balance + " in your checking account");
		return checking_balance;
	}
	
	public void setSavingsBalance(long savings_balance){
		this.savings_balance = savings_balance;
	}
	
	public long getSavingsBalance(){
		System.out.println("You have $" + savings_balance + " in your savings account");
		return savings_balance;
	}
	
	public static long totalMoney(){
		return amountOfMoney;
	}
	
	public void withdrawFunds(long withdraw){
		if (amountOfMoney > withdraw) {
			this.checking_balance = this.checking_balance - withdraw;
			amountOfMoney = this.checking_balance + this.savings_balance;
			System.out.println("You've withdrawn $"+ withdraw + ". You now have $"+amountOfMoney + " in your account.");	
		}
		else{
			System.out.println("Your funds are insufficient, you cannot make a withdrawl.");
		}
		
		
		
	}
	
	
}
