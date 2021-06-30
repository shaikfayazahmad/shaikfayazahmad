package practise;

public class MethodOverLoadDemo {
	public static void main(String[] args) {
		Calculate obj=new Calculate();
		obj.multiply(5.5f);
		obj.multiply(5);
		
	}
}
class Calculate{
	void multiply() {
		System.out.println("no paremetr method called......");
	}
	int multiply(int number) {
		int result=number*number+100;
		System.out.println("int type parameter called....."+ result);
		return result;
	}
	float multiply (float number) {
		float result=number*number;
		System.out.println("float paremeter gets called........"+ result);
		return result;
	}
}