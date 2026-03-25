package new1;
class accountbalance{
	private int balance;
	public void setaccount(int b){
		balance=b;
	}
	public int getaccount() {
		return balance;
	}
}

public class encapsulation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		accountbalance a=new accountbalance();
		a.setaccount(500);
		System.out.println(a.getaccount());
	}

}
