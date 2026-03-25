package new1;

import java.util.Scanner;

public class matrix {

	public static void main(String[] args) {
		    Scanner scn=new Scanner(System.in);
		    System.out.println("enter row and column");
		    int rows=scn.nextInt();
		    int col1=scn.nextInt();
			int[][] arr=new int[rows][col1];
		    System.out.println("enter the numbers");

			for (int i=0;i<rows;i++)
			{
				for(int j=0;j<col1;j++) {
					arr[i][j]=scn.nextInt();
				}
			}
		    System.out.println("the matrix is like");

			for(int i=0;i<rows;i++) {
				for(int j=0;j<col1;j++) {
				System.out.println(arr[i][j]);
				}
				}
			}
			
			

}
