package programs;

import java.util.HashSet;
import java.util.Scanner;


public class UniqueLetters {

	public static boolean isStringInt(String s)
	{
		int num;
		try
		{
			num=Integer.parseInt(s);
		
			return true;
		} 
		
		catch (NumberFormatException ex)
		{
			return false;
		}
	}
	public static boolean str1(String s){
		
		if(s==null){
			//return true;
			System.out.println("wrong input");
		}
	
		return false;
	}

	
	
	public static boolean str(String s){
		for(int i=0;i<=s.length()-1;i=i+1){
			int count=1;
			for(int j=0;j<=s.length()-1;j=j+1){
				//System.out.println(s2[j]);
				if(j<i && s.charAt(i)==(s.charAt(j)))
				{
					//System.out.println(s2[i]);
					count = 0;
					break;
					
				}
				
				else if(i==j){
					
				}
				else
				{
					if(j>i && s.charAt(i)==(s.charAt(j)))
					{
						count=count+1;
						return false;
					
					}
				}
			}
	}
		return true;
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
	
	//	HashSet hs=new HashSet();
		Boolean result=false;
		
		//System.out.println("Enter");
		char c;
		
		//int res=sc.nextInt();
		//Boolean result1=true;
		//if(result1){
		
		System.out.println("Enter the String");
		String s=sc.nextLine();
		System.out.println(s);
		if(s.isEmpty())
			System.out.println("Nothing is entered");
	int num=0;
	boolean v_str1=str1(s);
	boolean v_isint = isStringInt(s);
	boolean v1_isstr=str(s);
	//boolean v_str1=str1(s);
	
	if(v_isint)
	{
		System.out.println("Please enter a valid String");
		
	}
	else if(v_str1)
	{
		{
			System.out.println("Please enter a valid String");
			
		}
	}
	
	else{
		if(v1_isstr){
			System.out.println("Unique");
		}
		else{
			System.out.println("not unique");
		}
	
		
		}

		
	
	}
	}





/*String s="jaysa";//if you want to add data structures 
		
		  for(int i=0;i<=s.length()-1;i=i+1){
			result=hs.add(s.charAt(i));
			if(result==false){
				break;
			}
		}
		System.out.print(result);*/

	




