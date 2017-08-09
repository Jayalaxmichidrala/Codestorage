package programs;
//Q1:write a java program to add two input values and three input values 
import java.util.Scanner;

public class Input {
	Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a,b;
		
		Input c=new Input(12,6);//parameterized cons. you can give arguments here
		c.add(2,10);//we are calling method (object.method name) and should give parameters here when you call method
		c.add(8, 7,90);
		Input d=new Input(100,100,100);//another cons but we need to give different object name
		
		//calling cons
		
		String s="tekarch";
		String result=s.toUpperCase();
		System.out.println(result);
		
	}
	//method- we can give any name
	public void add(int x,int y){
		int sum=x+y;
		System.out.println(sum);
	}
	//another method
	public static void add(int x, int y,int z){
		int s=x+y+z;
		//return s;
		System.out.println(s);
		
	}
	
	//constructor-same as class name
	public Input(int x, int y){
		int z=x-y;
		System.out.println(z);
		
	}
	//another cons
	public Input(int x,int y, int z){
		int jaya=x+y+z;
		System.out.println(jaya);
	}

}
