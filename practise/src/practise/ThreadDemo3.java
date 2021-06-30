package practise;

public class ThreadDemo3 {
	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		t.setName("fayaz");
		System.out.println("reservatioin counter starting working .."+t.getName());
		ReservationCounter central=new ReservationCounter();
		Thread sonia=new Thread(new BookingJob(central,1000),"sonia");
		Thread ahmad=new Thread(new BookingJob(central,500),"ahmad");
		sonia.start();
		ahmad.start();	
	}
}
class BookingJob implements Runnable{
	ReservationCounter central;
	int amt;
	public BookingJob(ReservationCounter central,int amt) {
		this.central=central;
		this.amt=amt;
	}
	public void  run() {
		central.bookTicket(amt);
		central.giveChange();
	}
	
}
class ReservationCounter{
	int amt;
	public void bookTicket(int amt) {
		Thread t=Thread.currentThread();
		this.amt=amt;
		String name=t.getName();
		System.out.println(name+"has come to book ticket");
		System.out.println(name+"brought...."+amt);
		
	}
	public void giveChange() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("change given to ..."+name);
		System.out.println(name+"takes......"+(amt-100));
		
		
	}
}
