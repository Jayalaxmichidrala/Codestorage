package programs;

import java.util.Scanner;

public class LinearSearch {
	Scanner sc=new Scanner(System.in);

	 int key;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a=new int[6];
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter array elements");
		//System.out.println("enter the num you want to search");
		
		//int i=sc.nextInt();

		for(int i=0;i<=a.length-1;i=i+1){
			a[i]=sc.nextInt();
		}
					
		
		System.out.println("enter the num you want to search");
		int key=sc.nextInt();
		//key=0;
		int count=1;
		
		for(int i=0;i<=a.length-1;i=i+1){
						if(a[i]==key){
				System.out.println(key+" is present at this position in an array : "+i);
				//count=1;
				count = 0;
				System.out.println(count);
			}
						/*else if(count>=0)
								{
							//System.out.println(key+" notfund : ");
							count=count+1;
							
						}*/
		}
		//if(count>6){
		if(count==1){
		
				System.out.println(count+"no found");
			}
		

	}		

}

