package programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character,Integer> h=new HashMap<Character,Integer>();
		String s="JayalaxmiTaTiKonda123";
		
		for(int i=0;i<=s.length()-1;i=i+1){
			//System.out.println(s.charAt(i));
			//h.put(s.charAt(i), 1);
			char c=s.charAt(i);
			if(h.get(c)!=null){
			h.put(c, (h.get(c)+1));
			
		}
			else{
				h.put(c, 1);
				System.out.println(s.charAt(0));
			}
		}
		
	Set s1=h.entrySet();
		
		Iterator ite=s1.iterator();
		while(ite.hasNext()){
			Map.Entry me=(Map.Entry)ite.next();
			System.out.println("Key is :"+me.getKey()+" value is: "+me.getValue());
		}

	}

}
