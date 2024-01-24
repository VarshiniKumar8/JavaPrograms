package multithreading;

public class SynchronizedMethod implements Runnable{
	private Account account=new Account();
	public static void main(String[] args) {
		SynchronizedMethod accSynchronizedMethod=new SynchronizedMethod();
		Thread thread1=new Thread(accSynchronizedMethod);
		Thread thread2=new Thread(accSynchronizedMethod);
		thread1.setName("Varshini");
		thread2.setName("Loshini");
		thread1.start();
		thread2.start();
	}
	@Override
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			makeWithdrawal(500);
		}
	}
	synchronized void makeWithdrawal(int amount)
	{
		if(account.getBalance()>amount)
		{
			System.out.println(Thread.currentThread().getName()+" is going to withdrawal");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
			account.withdraw(amount);
			System.out.println(Thread.currentThread().getName()+" completes withdraw. Balance: " +account.getBalance());
		}
		else {
			System.out.println("Not enough balance in account for " +Thread.currentThread().getName()+ "\nBalance: " +account.getBalance());
		}
	 }

}
