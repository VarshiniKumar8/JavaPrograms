package multithreading;
public class MyThread implements Runnable {
	@Override
	public void run() {
		while(true) {
		    try {
		    	Thread.sleep(1000);
		    }
		    catch(InterruptedException e) {
		    	e.printStackTrace();
		    }
		    System.out.println("Currently executing thread:"+Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread myThread2=new MyThread();
		Thread t1=new Thread(myThread2);
		t1.setName("Varshini");
		t1.start();
		Thread t2=new Thread(myThread2);
		t2.setName("Loshini");
		t2.start();
	}
}