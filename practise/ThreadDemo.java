package practise;

public class ThreadDemo
{public static void main(String[] args) throws Exception {
	Thread t=Thread.currentThread();
	t.setName("this is my thread...");
	t.setPriority(10);
	System.out.println("sleep for 5 sec..");
	vacinationcenter();
	System.out.println("start the class");
	for(int i=0;i<5;i++) {
		System.out.println(i);
		Thread.sleep(1000);
	}
			
}
static void vacinationcenter()throws Exception{
	System.out.println("method called...");
	Thread.sleep(5000);
}
}


