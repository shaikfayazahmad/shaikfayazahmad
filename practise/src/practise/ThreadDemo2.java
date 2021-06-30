package practise;


import java.util.Date;
public class ThreadDemo2 {
	public static void main(String[] args) throws Exception{
		VaccinationCenter vc=new VaccinationCenter();
		Thread t=Thread.currentThread();
		t.setName("Sonia");
		System.out.println(new Date());
		System.out.println("Before comming to class....");
		Thread kala=new Thread(new JobToSonia(vc),"Sonia");
		kala.start();
		//vc.getToken();
		System.out.println("Take class.....for 7-9 Golden Batch...."+new Date());
	}	
}
class JobToSonia implements Runnable{
	VaccinationCenter vc;
	public JobToSonia(VaccinationCenter vc) {
		this.vc=vc;
	}
@Override
	public void run() {
		System.out.println("The job given to Sonia is executed from this method...");
		try{
			vc.getToken();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}	
}
class VaccinationCenter {
	public void getToken() throws Exception{
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+"...standing in queue for token....");
		Thread.sleep(10000);
		System.out.println("token received..."+new Date());
	}
}