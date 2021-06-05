package twelth;

import java.util.Scanner;

public class SquareAreaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the side of square");
		Scanner scanner =new Scanner(System.in);
		double side =scanner.nextDouble();
		double area = side*side;
		System.out.println("area of square is :" +area);

	}

}
