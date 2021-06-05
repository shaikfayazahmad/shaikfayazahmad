package seventh;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base = 10, exponent =5;
		int result =1;
		while(exponent != 0) {
			result *= base;
			--exponent;
			
		}
		System.out.println("result is :"+result);

	}

}
