package programs;

/*  Q3. You are given two sorted arrays, A and B, and A has a large enough buffer at the end to hold B. Write a method to merge B into A in sorted order. * */


import java.util.Arrays;

public class Mergearray_notthird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		int[] arr2=new int[]{3,5,7,8};
		arr[0]=1;
		arr[1]=2;
		arr[2]=4;
		arr[3]=6;
		arr[4]=9;
		arr[5]=10;
		
		System.arraycopy(arr2, 0, arr, 6, arr2.length);
		
		 Arrays.sort(arr);
		
		for(int i=0;i<=arr.length-1;i=i+1){
			System.out.println(arr[i]);
		}

	}

}
