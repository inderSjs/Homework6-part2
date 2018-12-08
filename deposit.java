
public class deposit implements Runnable 
{
	private BankAccount ac;
	private int amount;
	
	public deposit( BankAccount ac , int amount)
	{
		this.ac = ac;
		this.amount = amount;
	}
	
	public void run()
	{
		
		
			for( int i = 1; i <= 20 ; i++)
			{
				ac.deposit(amount);

			}
		
		
		
	}

}