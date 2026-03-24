package new1;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] dom= new int[12];
//      array=new int[10];
//      array[0]=10;
//      array[1]=11;
      dom[0]=dom[2]=dom[4]=dom[6]=dom[7]=dom[9]=dom[11]=31;
      dom[3]=dom[5]=dom[8]=dom[6]=30;
      dom[1]=28;
//      System.out.println(array[1]);
//      System.out.println(array[0]);
//      System.out.println(array[9]);
//      System.out.println(array[0]);
        int m=Integer.parseInt(args[0])-1;//itmwill conert string to int
        System.out.println(dom[m]);
	}}
