package programs;

import java.util.ArrayList;
import java.util.Iterator;
//WJP to remove the element from the list

public class ArrayListIMP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ele=new ArrayList();
		ele.add(0,"jaya");
		//ele.get(0);
		ele.add("Sri");
		ele.add("1");
		ele.add(4);
		//ele.addAll("Sri",1);
		//ele.addAll(ele);//addAll method adds all the ele..in A.L & same like "toString" method
		System.out.println(ele);//it will give you the string representation.
		ele.add(null);
		ele.add(null);
		ele.remove(2);
		System.out.println(ele);
		ele.add(3,"chair");//all the elements shift 1 position to the right
		
	Iterator ite =ele.iterator();
	while(ite.hasNext()){
		System.out.println(ite.next());
	}
	}
}
		
		//wjp to remove the element from the list
	
/*	ArrayList ele1=new ArrayList();
	
	
	ele1.add(100);
	ele1.add(200);
	ele1.add(270);
	ele1.add(301);
	ele1.add(300);
	
	Iterator ite1=ele1.iterator();
	while(ite1.hasNext()){
	    Integer i = (Integer) ite1.next();
		if(i %2==0){
			ite1.remove();
		}
	}
	
		System.out.println(ele1);

	}

}*/
