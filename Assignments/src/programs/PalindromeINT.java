package programs;

import java.util.Scanner;

public class PalindromeINT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[3];
		System.out.println("Enter 3 array elements");
		//int [] arr=sc.nextInt();
		int value=0;
		
		for(int i=0;i<=arr.length-1;i=i+1){
			 arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<=arr.length-1;i=i+1){
			int a=arr[i];
			int j=(arr.length-1-i);
			if(arr[i]==arr[j]){
				//System.out.println("polyn");
				value=0;
			}
			else{
				//System.out.println("not poly");
				value=1;
			}
			
		}
		if(value==0){
			System.out.println("This is Polyndrome");

	}
		else{System.out.println("This is  not Polyndrome");
		}

}
}
