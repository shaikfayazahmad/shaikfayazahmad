package thirteenth;

import java.util.Scanner;

public class AreaTriangleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter the width of triangle :");
		double width = scanner.nextDouble();
		System.out.println("enter the height of the triangle :");
		double height = scanner.nextDouble();
		double area = (width+height);
		System.out.println("area of triangle is :" + area);
	
	}

}
