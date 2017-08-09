package programs;

//Q23. WJP to differentiate input as string, int or bool *

import java.util.Scanner;

public class Input_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		String s=sc.nextLine();
		//int result =Integer.parseInt(s);
		Input_23 c=new Input_23();
		boolean v;
		v=c.isStringboolean(s);
		System.out.println(v);
		
		boolean v1;
		
		 v1=c.isStringInt(s);
		 System.out.println(v1);
		
	}


	public boolean isStringInt(String s)
	{
	    try
	    {
	        Integer.parseInt(s);
	        return true;
	    } catch (NumberFormatException ex)
	    {
	        return false;
	    }
	}
	
	public boolean isStringboolean(String s)
	{
	    try
	    {
	        return Boolean.parseBoolean(s);
	        //return true;
	    } catch (NumberFormatException ex)
	    {
	        return false;
	    }
	}


}
