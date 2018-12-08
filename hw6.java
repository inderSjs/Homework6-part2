import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.*;

public class hw6 {
	
	
	
	public static void main(String[] args)
	{
		BankAccount account = new BankAccount();
		
	      ExecutorService service = Executors.newCachedThreadPool();

		for ( int i = 0 ; i < 100 ; i++)
		{
			withdraw w1 = new withdraw( account , 100);
			deposit d1 = new deposit( account , 100);
			
			service.execute(w1);
			service.execute(d1);
			service.shutdown();
			
			
		}
		
		
	}

}
