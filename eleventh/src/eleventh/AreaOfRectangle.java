package eleventh;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter the length of rectangle");
		double length = scanner.nextDouble();
		System.out.println("enter the width of rectangle");
		double width = scanner.nextDouble();
		double area = length * width;
		System.out.println("are of rectangle is : "+area);

	}

}
