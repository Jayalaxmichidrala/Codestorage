package programs;
import java.util.Arrays;
import java.util.Scanner;

public class SortINT {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//int n=sc.nextInt();
		
		int [] array= new int[]{1,8,10,4,45,67,87,36,3,18};
		
		Arrays.sort(array);
		
		for(int i=0;i<=array.length-1;i=i+1){
			System.out.println(array[i]);
		}
		
			
		}
		
		
	}
		

	




