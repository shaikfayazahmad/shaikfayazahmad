package practise;

public class AccessModExample {
	public int p;
	private int pr;
	int nomod;
	protected int pt;
	
	void met() {
		System.out.println(p);
		System.out.println(pr);
		System.out.println(nomod);
		System.out.println(pt);
	}
	//all the access modifiers are accessed in the class

}
class AccessSub extends AccessModExample{
	void met() {
		System.out.println(p);
		System.out.println(pr);
		System.out.println(nomod);
		System.out.println(pt);
	}
	// here we are getting the error since the private modifier cannot accesesed out of the class eve i the sub class too
	
}
class AccessSub2{
	void met() {
		AccessModExample obj=new AccessModExample;
		System.out.println(obj.p);
		System.out.println(obj.pr);
		System.out.println(obj.nomod);
		System.out.println(obj.pt);
	}
	//same package not sub class private modifier cannot accesed
}

