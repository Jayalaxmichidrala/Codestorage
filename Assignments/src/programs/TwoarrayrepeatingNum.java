package programs;

public class TwoarrayrepeatingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a={1,6,4,8,3,4};
		int[] b= {2,6,7,4,8,2};
		for(int i=0;i<=a.length-1;i=i+1){
			//System.out.println(a[i]);
			for(int j=0;j<=b.length-1;j=j+1){
				//System.out.println(i);//dont remove to see the vals
				//System.out.println("jval"+j);//just to check the values
				if(i>j){
					
				}
				else if(a[i]==b[j]){
					System.out.println("repeating numbers are"+a[i]);
				}
			}
		}

	}

}
