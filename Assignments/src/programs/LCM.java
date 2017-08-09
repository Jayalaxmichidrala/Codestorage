package programs;

import java.util.Scanner;

public class LCM {
	 Scanner sc=new Scanner(System.in);

	public static void  main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);

		int a = 336;
		int c;
		int d=sc.nextInt();
		int b = 224;
		//int a = 336;

		int lcm=0;
		
		for(int i=b;i<=a*b;i++){
			if(i%a==0 && i%b==0){
				System.out.println(i);
				}
		}
				
		//System.out.println(lcm);
		
	}

}
