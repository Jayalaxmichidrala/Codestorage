package programs;

import java.util.Scanner;

public class FindingOddandEvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner input=new Scanner(System.in);
		System.out.println("enter the num");
		int num=input.nextInt();
		
		if(num%2==0){
			System.out.println("jaya");
			
		}
		else{System.out.println("no jaya");
		
		}*/
		String s="waterbottle";
		int count=1;
		
		for(int i=0;i<=s.length()-1;i=i+1){
			for(int j=0;j<=s.length()-1;j=j+1){
				//System.out.print("ival"+ i);
				//System.out.println("jval...."+j);
				//System.out.println(s.charAt(j));
				if(j<i && s.charAt(i)!=s.charAt(j)){
					
					count=0;
					break;
				}
				else{
					count++;
				}
			}
			if(count>0){
				System.out.println(s.charAt(i));
			}
		}

	}
}


