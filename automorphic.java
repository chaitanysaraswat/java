package oopsAssignment;

public class automorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=25;
		int square=x*x;
		String len=Integer.toString(x);
		int count=0;
		int length1=len.length();
		while(square>0) {
			while(x>0) {
				int rem1=x%10;
				int rem2=square%10;
				if(rem1==rem2) {
					count++;
				}
				else {
					break;
				}
				x=x/10;
				
			}
			square=square/10;
		}
		System.out.println(count);
		if(count==length1) {
			System.out.println("number is automphoric");
		}
		else {
			System.out.println("number is not automphoric");
		}

	}

}
