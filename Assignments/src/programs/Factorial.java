package programs;

import java.util.Scanner;

public class Factorial {

	//private static final int i = 0;
 int j;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the j value");
  
			 /* int i,fact=1;  
			  int number=5;//It is the number to calculate factorial    
			  for(i=1;i<=number;i++){    
			      fact=fact*i;    
			  }    
			  System.out.println("Factorial of "+number+" is: "+fact);    
			 }  
			}  */
		//System.out.println("Enter j value:");
		// TODO Auto-generated method stub
		int i;
		int j=sc.nextInt();
		//int j;
		int k1=1;
		
	
	
		for(i=1; i<=j;i=i+1){
			k1=k1*i;
		
			//System.out.println("Enter j value:");
			System.out.println(k1);
			
		}
		//System.out.println(k);
  
	}

}
