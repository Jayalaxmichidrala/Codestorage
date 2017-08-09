package programs;
//WJP to print unique chracters.
public class OccuranceOfAllChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="papersandchairs";
		
		//1st method
		
       int count=0;
        int count1=0;
		
		for(int i=0;i<=s.length()-1;i=i+1){
			count=1;
			//int count1 =0 ;
			for(int j=0;j<=s.length()-1;j=j+1){
				//System.out.println(s2[j]);
				if(j<i && s.charAt(i)==(s.charAt(j)))
				{
					//System.out.println(s2[i]);
					count = 0;
					break;
					
				}
				
				else if(i==j){
					
				}
				else
				{
					if(j>i && s.charAt(i)==(s.charAt(j)))
					{
						count=count+1;
					
					}
				}
			}
			
			if(count>=1){
				System.out.println(s.charAt(i)+" "+count);
			}

	}
	}
}
        
  

//another method
	/*	String s1="papersand chairsalso";
		String s2=" ";
		
		for(int i=0;i<=s1.length()-1;i=i+1){
			//System.out.println(s1.charAt(i));
			if(!s2.contains(String.valueOf(s1.charAt(i)))){
				s2=s2+s1.charAt(i);
				//return;
				//System.out.println(s2);
			}
			//System.out.println("jaya");
			
		}
		System.out.println(s2);
		
	}
}*/


		


