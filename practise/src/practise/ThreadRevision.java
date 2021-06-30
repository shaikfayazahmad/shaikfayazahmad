package practise;

public class ThreadRevision {
	public ThreadRevision() {
		Thread t=new Thread(new ThreadJob());
		t.start();
	}
	public static void main(String[] args) {
		//How to capture the main thread
		//All java programs run in main thread by default.
		new ThreadRevision();
		Thread t=Thread.currentThread();
		System.out.println(t);//here if this removed child thread gets executed and then 0,1,2,3,4
		//lazy for loop
		for(int i=0;i<5;i++) {
			System.out.println(i);//if this statement written here them naim methid ,0,child meth
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
			//System.out.println(i);
		}
	}
}
class ThreadJob implements Runnable{
	@Override
	public void run() {
		System.out.println("child thread is executed....");
	}
}