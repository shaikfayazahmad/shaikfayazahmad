package exercise1;

	public class CloneDemo {
		public static void main(String[] args) {
			Sheep mothersheep=new Sheep();
			mothersheep.name="i am the mother sheep...";
			Sheep dolly=mothersheep.createClone();//cloning...PROTOTYPE-PROTOTYPE PATTERN
			dolly.name="I am the clone dolly...";
			System.out.println("Mother name...:"+mothersheep.name);
			System.out.println("Clone Name...:"+dolly.name);
			
		}
	}
	class Sheep implements Cloneable{
		public Sheep() {
			System.out.println("sheep object created....");
		}
		public String name;
		
		public Sheep createClone() {
			try {
				return (Sheep)super.clone();
			}catch(CloneNotSupportedException cne) {
				cne.printStackTrace();
				return null;
			}
		}
	}

}
