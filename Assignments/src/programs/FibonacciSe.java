package programs;
//Write a Pseudo code and java program to generate the nth Fibonacci number using recursion. what is the time complexity.
public class FibonacciSe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0;
		int n2=1;
		int n3;
		int count=10;
		System.out.print(n1+" "+n2);
		for(int i =2;i<=count;i=i+1){
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		
//Time complexity is n since we used one for loop.		

	}

}