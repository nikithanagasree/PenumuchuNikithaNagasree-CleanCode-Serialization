package simpleandcompoundinterests;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;


public class Client {

	@Test
	public void interestTest() {
		Scanner sc=new Scanner(System.in);
		InterestCalculator a=new InterestCalculator();
		int choice;
		float principal,time,rate,number,simpleinterest;
		double compoundinterest;
		do{
			System.out.println("-----------------------------------");
			System.out.println("1.Calculating Simple Interest");
			System.out.println("2.Calculating Compound Interest");
			System.out.println("Enter Your Choice:");
			choice=sc.nextInt();
			switch(choice){
				case 1:System.out.println("Enter Principal,Time and Rate");
					   principal=sc.nextFloat();
					   time=sc.nextFloat();
					   rate=sc.nextFloat();
					   simpleinterest=a.calSimpleInterest(principal,time,rate);
					   System.out.println("Simple Interest is:"+simpleinterest);
					   break;
				case 2:System.out.println("Enter Principal,Time,Rate and Number of times interest applied");
				   		principal=sc.nextFloat();
				   		time=sc.nextFloat();
				   		rate=sc.nextFloat();
				   		number=sc.nextFloat();
				   		compoundinterest=a.calCompoundInterest(principal,time,rate,number);
				   		System.out.println("Compound Interest is:"+compoundinterest);
				   		break;
			}
		}while(choice<3);
		sc.close();
	}

}
