package programs;

import java.util.Scanner;

public class IntUpperLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		//String s="tv123tVS";
		char c;
		int int_count=0;
		int upper_count=0;
		int lower_count=0;
		System.out.println("Enter the String");
		String s=sc.nextLine();
		
		for(int i=0;i<=s.length()-1;i=i+1){
			c=s.charAt(i);
			System.out.println(c);
			if(Character.isUpperCase(c)){
				upper_count++;
	
			}
			else if(Character.isLowerCase(c)){
				lower_count++;
				
			}
			else if(Character.isDigit(c)){
				int_count++;
			}
			
			
		}
		System.out.println("Uppercase count :"+upper_count+" lowercase count: "+lower_count+" integers count: "+int_count);

	}

}
