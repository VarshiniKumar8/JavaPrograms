package multithreading;
public class ThreadTypes extends Thread {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadTypes t1= new ThreadTypes();
		ThreadTypes t2 =new ThreadTypes();
		ThreadTypes t3=new ThreadTypes();
		t1.setName("Thread1");
		t2.setName("Thread2");
		t3.setName("Thread3");
		t1.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
	}
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("functionality of deamon Thread:"+getName());
		}
		else {
			System.out.println("functionality of user Thread:"+getName());
		}
	 }
}
