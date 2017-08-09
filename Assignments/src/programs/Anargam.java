package programs;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anargam {
	public static void main (String []args){
		String s="Debit card";
		String j="Bad crediT";
		
		String m="JAYA";
		String m1=m.toLowerCase();
		System.out.println(m1);
		
		String s1=s.replaceAll("\\s"," ");
		String j1=j.replaceAll("\\s", " ");
		System.out.println(j1);
		System.out.println(s1);
		String s2=s1.toLowerCase();
		String j2=j1.toLowerCase();
		System.out.println("s2 val is "+ s2);
		System.out.println("j2 val is :"+ j2);
		
		if(s2.length()!=j2.length()){
			System.out.println("false");
		}
		else{
		char[] array=s2.toCharArray();
		System.out.println(array);
		
		char[] array1=j2.toCharArray();
		Arrays.sort(array);
		Arrays.sort(array1);
		System.out.println(array1);
		System.out.println(array);
		
		String str = String.valueOf(array);//syntax to convert char array to string
		String str1 = String.valueOf(array1);
		
		       if(str.equals(str1)){
			     System.out.println("This is anagram");
		       }
		       else{
					System.out.println("Not Anagram");
				}
			
		}
	}
		

}


