package programs;

import java.util.Scanner;

public class OccuranceOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr=new int[8];
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("Enter the array elaments");
		for(int k=0;k<=arr.length-1;k=k+1){
			arr[k]=sc.nextInt();
		}
		
		for(int i=0;i<=arr.length-1;i=i+1){
			count=1;
			for(int j=0;j<=arr.length-1;j=j+1){
				if(j<i && arr[i]==arr[j]){
					break;
				}
				else if(i==j){
					
				}
				else{
					if(arr[i]==arr[j]){
						count=count+1;
						//System.out.println("Repeating numbers are"+arr[i]);
					}
				}
			}
			if(count>1){
				System.out.println("Repeating numbers are "+arr[i]+" "+count+" times");
			}
		}
		

	}
}


