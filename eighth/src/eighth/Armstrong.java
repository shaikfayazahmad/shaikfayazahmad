package eighth;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number =120, originalNumber, remainder, result= 0;
				
		originalNumber = number;
		while(originalNumber != 0) 
		{
			remainder = originalNumber % 10;
			result += Math.pow(remainder, 3);
			originalNumber /= 10;
		}
		if (result == number) 
			System.out.println(number +" an Armstrong number. ");
		else
			System.out.println( number + "not an Armstrong number.");
		

	}
}

