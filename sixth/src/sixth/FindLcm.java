package sixth;


public class FindLcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x= 72, y= 120, lcm;
		lcm = (x > y ) ? x : y ;
		while(true) {
			if (lcm %x == 0 && lcm % y == 0) {
				System.out.printf("The LCM of %d and %d is %d", x, y,lcm);
			break;
		}
		++lcm;
	}
}

}

