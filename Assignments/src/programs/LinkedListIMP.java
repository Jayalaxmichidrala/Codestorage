package programs;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListIMP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*LinkedList a=new LinkedList();
		a.add("nancy");
		a.add(1,"john");
	
		//peek () method it will tell us the val of 0 th node but it wont remove where as poll() method will remove the val very imp
		/*System.out.println(a.peek());
		System.out.println(a.poll());
		System.out.println(a.poll());
		System.out.println(a);*/
		//a.remove();//default it is removed the 1 st node
	/*	System.out.println(a);
		a.set(1, "tom");//overridden the 1 st index value
//here it will give you the error B/c set and add method depends on the size and dont go beyond the size if you want to giveindex position
		System.out.println(a);
		a.add("cathy");
		a.add(1);
		a.add(null);
		a.add(null);
		System.out.println(a);
		
	Iterator ite=a.descendingIterator();//printing reverse using descending iterator
		System.out.println(ite);
		while(ite.hasNext()){
			System.out.println(ite.next());
		}

	}*/
		LinkedList s=new LinkedList();
		LinkedList s2=new LinkedList();
		Hashtable h=new Hashtable();
		
		s.add("p");
		s.add("a");
		s.add("p");
		s.add("e");
		s.add("r");
		
		
			//System.out.println(s);
			for(int i=0;i<=s.size()-1;i=i+1){
				//System.out.println(s.get(i));
				if(!s2.contains(s.get(i))){
					//s.addAll(s2);
					//s2=(LinkedList) s.clone();
					h.put(s.get(i),true);
				}
				//System.out.println(s2);
			}
			System.out.println(h);
		
		
	}

}
