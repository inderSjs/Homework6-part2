import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
	
	private int balance;
	private Lock accountLock = new ReentrantLock();
	
	public BankAccount()
	{
		balance = 0;
	}
	
	
	
	public void withdraw( int amount)
	{
		accountLock.lock();
		try
		{
			System.out.println("withdrawing: " + amount);
			int newBalance = this.balance - amount;
			this.balance = newBalance;
			System.out.println("new balance is: "+ newBalance);
		}
		finally
		{
			accountLock.unlock();
		}
		
		
		
	
		
	}
	
	public void deposit( int amount)
	{
		accountLock.lock();
		try
		{
			System.out.println("Depositing: " + amount);
			int newBalance = this.balance + amount;
			this.balance = newBalance;
			System.out.println("new balance: "+ newBalance);
		}
		finally
		{
			accountLock.unlock();
		}
		
	}
	
	public void getBalance()
	{
		System.out.println("Balance is: " + this.balance);
	}

}
