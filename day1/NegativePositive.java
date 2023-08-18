package week1.day1;

import java.util.Scanner;

public class NegativePositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int NegativeNumber;
		int PositiveNumber;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		{
			System.out.println("Enter a Negative Number");
			
			NegativeNumber = sc.nextInt();
			if(NegativeNumber<0);
			
			PositiveNumber = NegativeNumber*(-1);
			System.out.println("PsositiveNumber"+PositiveNumber);
		}
		
		{
			System.out.println("Please Enter a PositiveNumber");
		}
	
	}

}
