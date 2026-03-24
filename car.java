package new1;
class car1{
	String color;
	int speed;
	void drive() {
		System.out.println("car is driving");
	}
}
public class car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car1 c1=new car1();
		c1.speed=120;
		c1.color="Red";
		System.out.println(c1.color);
		System.out.println(c1.speed);
	}

}
