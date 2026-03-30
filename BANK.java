package oopsAssignment;

import java.util.Scanner;

//Develop a class BankAccount having the following data members:  
//int accno 
//double balance 
//Write appropriate constructors to initialize data members. Define the following functions: 
//withdraw: balance will reduce 
//deposit: balance will increase 
//show: display accno and balance 
//If the user tries to withdraw more than the balance, use exception handling code. Demonstrate the 
//concept of exception handling in the main() function. 
class bankaccount{
	int accno;
	double balance;
	bankaccount(int accno,int balance){
		this.accno=accno;
		this.balance=balance;
	}
	void withdraw(int amt) {
		if (amt<balance) {
			balance=balance-amt;
		}
		else{
			System.out.println("cant withdraw");
		}}
	void deposit(int amt) {
		this.balance=this.balance+amt;
	}
	void show() {
		System.out.println(balance);
	}
	}

public class BANK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int accno=scn.nextInt();
		int balance=scn.nextInt();
		
		bankaccount obj1=new bankaccount(accno,balance);
		obj1.deposit(1000);
		obj1.withdraw(400);
		obj1.show();
       
	}

}
