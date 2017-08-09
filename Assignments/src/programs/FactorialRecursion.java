package programs;

public class FactorialRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,fact=1;  
		  int number=8;    
		  fact = factorial(number);   
		  System.out.println("Factorial of "+number+" "+fact);    
		 }  
	

	public static int factorial(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * factorial(n-1));    
	}
}
