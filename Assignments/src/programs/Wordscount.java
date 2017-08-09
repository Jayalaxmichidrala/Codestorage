package programs;

import java.util.Scanner;

public class Wordscount {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		// TODO Auto-generated method stub
		String s1="he is good boy and she is good girl";
		;//=s1.split(" ");
		int num_of_words;
		
		System.out.println("enter number of words");
		num_of_words = sc.nextInt();
		String [] s2=new String[num_of_words];
		System.out.println("Enter the words");
		for(int i=0; i<num_of_words;i=i+1)
			{ 
				s2[i]=sc.nextLine();
			}
		
		//System.out.println(s2[1]);
		int count=0;
		
		for(int i=0;i<=s2.length-1;i=i+1){
			count=1;
			//int count1 =0 ;
			for(int j=0;j<=s2.length-1;j=j+1){
				//System.out.println(s2[j]);
				if(j<i && s2[i].equals(s2[j]))
				{
					//System.out.println(s2[i]);
					count = 0;
					break;
					
				}
				
			else if(i==j){
					
				}
				else
				{
					if(j>i && s2[i].equals(s2[j]))
					{
						count=count+1;
						//System.out.println(count);
					//	System.out.println(s2[i] + " "+count);
					
					}
				}
			}
			//if(count>1)
			//{System.out.println(s2[i] + " "+count);
			if(count>=1){
				System.out.println(s2[i]+" "+1);
			}

	}
	
		
}
	
	
}

	
	
	

	
	
	


