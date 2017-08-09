package programs;



public class Quicksort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			int [] arr=new int[6];//{1,4,8,2,6,9};
			arr[0]=1;
			arr[1]=3;
			arr[2]=6;
			arr[3]=2;
			arr[4]=7;
			arr[5]=9;
			quickSort(arr,0,arr.length-1);
			//System.out.println(x);
			
			for(int i=0;i<=arr.length-1;i=i+1){
				System.out.println(arr[i]);
				
			}
			
	}
			
		public static void quickSort(int array [], int low,int high){	
			
	
			int temp;
			int i=low;
			int j=high;
			int pivot= array[(low+high)/2];
			
			System.out.println(pivot);
			while(i<=j){
				System.out.println("itiration start");
				while(array[i]<pivot)
					i=i+1;
				//	System.out.println("i val"+i);
				//	System.out.println(array[i]);
				
					while(array[j]>pivot)
						j=j-1;
				//	System.out.println("j val"+j);
					if(i<=j){
						temp = array[i];
		                array[i] = array[j];
		                array[j] = temp;
		                
		                i=i+1;
		                j=j-1;
					}
				//	System.out.println(array[i]);
				//	System.out.println(array[j]);
					//System.out.println(rray[]);
					  if (low < j)
				            quickSort(array, low, j);
				      
				        if (i < high)
				            quickSort(array, i, high);

				}
			}
}
			
			
			
		




	


