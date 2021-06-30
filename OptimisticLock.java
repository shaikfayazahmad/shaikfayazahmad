package practise;

public class OptimisticLock {
		public static void main(String[] args) {
			CounsellingHall university=new CounsellingHall();
			Thread imran=new Thread(new CounsellingJob(university),"fayaz");
			Thread secondsonia=new Thread(new CounsellingJob(university),"secondsonia");
			imran.start();
			secondsonia.start();
		}
	}
	class CounsellingJob implements Runnable{
		public CounsellingJob(CounsellingHall university) {
			this.university=university;
		}
		CounsellingHall university;
		@Override
		public void run() {
		//	synchronized (university) {
			// TODO Auto-generated method stub
			if(Thread.currentThread().getName().equals("fayaz")) {
				university.table1();university.table2();
			}
			else if(Thread.currentThread().getName().equals("secondsonia")){
				university.water();
			}
		//	}
		}
	}
	class CounsellingHall{
		synchronized public void table1() {
			System.out.println("entered table1...:"+Thread.currentThread().getName());
			try {Thread.sleep(2500);}catch(Exception e) {}
		}
		synchronized public void table2() {
			System.out.println("entered table2...:"+Thread.currentThread().getName());
		}
		public void water() {
			System.out.println("entered water area to drink water....:"+Thread.currentThread().getName());
		}
	}