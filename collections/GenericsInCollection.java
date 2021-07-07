package collections;

public class GenericsInCollection {

}
class Ball{
	public void play() {
		System.out.println("child is plYING WITH BALL...");
	}
	
}
class Sweet{
	public void eat() {
		System.out.println("chikd is eating the sweets.....");
	}
	
}
// aproach 1
class Child{
	Ball ball;
	public void action() {
		ball.play();
	}
	
}