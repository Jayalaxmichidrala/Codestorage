package programs;

import java.util.LinkedList;

public class NodeDeletoin {
	int n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedList llist = new LinkedList();
		 
	        llist.push(7);
	        llist.push(1);
	        llist.push(3);
	        llist.push(2);
	        System.out.println(llist);
	       // llist.NodeDeletion(3);
		

	}
/*	public static boolean delnode(int position){
		if(n==null ||n.next==null){
			return false;
			System.out.println("list is empty");
		}
		else{
			NodeDeletion next = n.next;
			 n.data = next.data;
			 n.next = next.next;
			 return true;
		}*/
	}


