package programs;

import java.util.Scanner;

public class CharRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter the String");
		String s1=sc.nextLine();
		
		System.out.println("Enter the char");
		char c=sc.next().charAt(0);
		String r = ""+c;
		String result = s1.replaceAll(r,"");
		System.out.println(result);

	}

}

