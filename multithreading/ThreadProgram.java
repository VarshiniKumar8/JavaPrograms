package multithreading;

public class ThreadProgram extends Thread {
	@Override
	public void run() {
		while(true)
	    {
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println("Currently executing Thread: "+getName());
	    }
	}
	public static void main(String args[]) {
		ThreadProgram t1=new ThreadProgram();
		t1.setName("Varshini");
		t1.start(); 
		ThreadProgram t2=new ThreadProgram();
		t2.setName("Loshini");
		t2.start();
	}
}
