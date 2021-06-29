package practise;

public class InherDemo {
	public static void main(String[] args) {
		Employee e=new Employee();
		Engineer eng=new Engineer();
		Human h=new Human();
		
		e.met(2);
		eng.met(2);
		h.met(2);
		e.met(0);
		h.blabla();
	}

}
class Human{
	public void blabla() {
		System.out.println("blabla method is called......");
	}
	public void met(int i) {
		System.out.println("met method of blabla is called....");
	}
}
class Employee extends Human{
	public void met(int i) {
		System.out.println("met method of employee is called");
	}
	
}
class Engineer extends Employee{
	public void met(int i) {
		System.out.println("met method of enginner class is called...");
		super.met(4);
		super.blabla();
		return;
	}
	public void swim() {
		System.out.println("swim method is called.......");
	}
	
}