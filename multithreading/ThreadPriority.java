package multithreading;
public class ThreadPriority extends Thread{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadPriority t1=new ThreadPriority();
		ThreadPriority t2= new ThreadPriority();
		t1.setName("Thread1\n");
		t2.setName("Thread2\n");
		t1.setPriority(MIN_PRIORITY);
		t2.setPriority(MAX_PRIORITY);
		t1.start();
		t2.start();
	}
	public void run() {
		System.out.println("Thread Name:"+getName()+"Thread Priority:"+getPriority());
	}
}

