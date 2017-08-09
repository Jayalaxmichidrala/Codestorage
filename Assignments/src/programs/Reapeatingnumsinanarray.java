package programs;

public class Reapeatingnumsinanarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		arr[0]=11;
		arr[1]=20;
		arr[2]=11;
		arr[3]=21;
		arr[4]=20;
		for(int i=0;i<=arr.length-1;i=i+1){
			//System.out.print("outer for  "+arr[i]);
		
			for(int k=i+1;k<=arr.length-1;k=k+1){
				//System.out.print(" --- inner for  "+arr[k]);
				if(arr[i]==arr[k]){
					System.out.println("these are repeating numbers"+ arr[i]);
				}
			}
			
		}
		

	}

}
