package programs;

public class First3Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr=new int[]{3,2,4,7,10,3,1,5,8,4};
		
		for(int i=0;i<arr.length-1;i=i+1){
			for(int j=arr.length-1;j>=0;j=j-1){
				if(j%3==0){
					int k=j-1;
					System.out.println(arr[k]);
				}
				//System.out.println(arr[j]);
				
			}
		}

	}

}
