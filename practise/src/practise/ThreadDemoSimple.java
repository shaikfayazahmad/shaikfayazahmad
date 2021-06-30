package practise;

public class ThreadDemoSimple {
	public static void main(String[] args) {
		Thread t=new Thread(new Job());
		t.start();
		
	}

}
class Job implements Runnable{
	public void run() {
		System.out.println("thread execution logic....");
	}
}
