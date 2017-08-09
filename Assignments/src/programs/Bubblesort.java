package programs;

import java.util.Scanner;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("ENTER the values");
		int [] arr=new int[6];//{1,4,8,2,6,9};
		arr[0]=10;
		arr[1]=3;
		arr[2]=6;
		arr[3]=2;
		arr[4]=7;
		arr[5]=9;
		//if you want to take the input from user:
		/*for(int x=0;x<=arr.length-1;x=x+1){
			arr[x]=sc.nextInt();
		}*/
		for(int i=0;i<=arr.length-1;i=i+1){
			//System.out.print(arr[i]);
			//System.out.println(i);
			//arr[i]=sc.nextInt();
			for(int j=i+1;j<=arr.length-1;j=j+1){
				//System.out.println(arr[j]);
			
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]= temp;
					
				}
			}
		}
		for(int k=0;k<=arr.length-1;k=k+1){
			System.out.println(arr[k]);
		}

	}
}
