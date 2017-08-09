package programs;

//wjp to write UNIQUE LETTERS.

public class UniqueWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="waterbottle";
		//int count=1;
		
		int count=0;
        int count1=0;
		
		for(int i=0;i<=s.length()-1;i=i+1){
			count=1;
			//int count1 =0 ;
			for(int j=0;j<=s.length()-1;j=j+1){
				if(j<i && s.charAt(i)==s.charAt(j)){
					//System.out.print(s.charAt(j));
					break;
				}
				//else if(j>i && )
			}
			}


	}

}
