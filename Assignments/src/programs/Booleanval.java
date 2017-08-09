package programs;

import java.util.Scanner;

public class Booleanval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first boolean value");
		boolean a=sc.nextBoolean();
		System.out.println("Enter second boolean value");
		boolean b=sc.nextBoolean();
		System.out.println("Enter third boolean value");
		boolean c=sc.nextBoolean();
		
		if((a && b) || ( b && c) || (a && c))
		{
		System.out.println(" Two of the entered values are TRUE");
		}
		else
		{
			System.out.println(" two of the entered values are not TRUE");
		}
		

	}

}
