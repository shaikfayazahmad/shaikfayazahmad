package fancheck;

import java.util.Scanner;

public class GoodFanDemo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//BadFan shaitan=new BadFan();
		GoodFan khaitan=new GoodFan();
		while(true) {
			System.out.println("Press a key and then Enter for pulling chain");
			scan.next();
			khaitan.pull();
		}
	}
}
class GoodFan{
	State state=new SwitchOffState();
	public void pull() {
		state.pull(this);
	}
}
abstract class State{
	public abstract void pull(GoodFan fan);
}
class SwitchOffState extends State{
	public void pull(GoodFan fan) {
		System.out.println("Switch on state");
		fan.state=new SwitchOnState();
	}
}
class SwitchOnState extends State{
	@Override
	public void pull(GoodFan fan) {
		System.out.println("medium speed state");
		fan.state=new MediumSpeedState();
	}
}
class MediumSpeedState extends State{
	@Override
	public void pull(GoodFan fan) {
		System.out.println("high speed state");
		fan.state=new HighSpeedState();
	}
}
class HighSpeedState extends State{
	@Override
	public void pull(GoodFan fan) {
		System.out.println("swtitc off state");
		fan.state=new SwitchOffState();
	}
}


