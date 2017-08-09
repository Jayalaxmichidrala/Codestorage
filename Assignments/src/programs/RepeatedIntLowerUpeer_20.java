package programs;

import java.util.Scanner;

public class RepeatedIntLowerUpeer_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		//String s1="paperroll";
		char s2;
		int count=0;
		int upper_count=0;
		int lower_count=0;
		int int_count=0;
		
		System.out.println("Enter the String");
		String s1=sc.nextLine();
		for(int i=0;i<=s1.length()-1;i=i+1){
			count=1;
			for(int j=0;j<=s1.length()-1;j=j+1){
				if(j<i && s1.charAt(i)==s1.charAt(j)){
					break;
				}
				
			else if(i==j){
					
				
				}
				else{
					if(s1.charAt(i)==s1.charAt(j)){
						count=count+1;
						//System.out.println(s1.charAt(i) + " "+count);
						if(Character.isUpperCase(s1.charAt(i))){
							upper_count++;
				
						}
						else if(Character.isLowerCase(s1.charAt(i))){
							lower_count++;
							
						}
						else if(Character.isDigit(s1.charAt(i))){
							int_count++;
						}
					}
				}
			}
			if(count>1){System.out.println(s1.charAt(i) + " "+count);
		}


	}
		System.out.println("Uppercase count :"+upper_count+" lowercase count: "+lower_count+" integers count: "+int_count);
		

	}

}
