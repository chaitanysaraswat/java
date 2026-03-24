package new1;
class animal1{
	void eat() {
		System.out.println("Aniaml is eating");
	}
}
class dog extends animal1{
	void bark() {
		System.out.println("dog is barking");
	}
}
public class animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog b=new dog();
		b.eat();
		b.bark();

	}

}
