package new1;
class student{
	String name;
	int age;
	student(String name,int age){
		this.name=name;
		this.age=age;
	}
}
public class constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     student s1=new student("chaitany",19);
     s1.name="chaitany";
     s1.age=19;
     System.out.println(s1.name);
     System.out.println(s1.age);
	}

}
