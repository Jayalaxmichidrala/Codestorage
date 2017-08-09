package programs;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListOBJ {
	
	private String name;
	private int age;
	private int id;
	
	//creating the constructor of the class and passing the arguments
		public ArrayListOBJ(String Stu_name,int newage,int newid){
			this.name=Stu_name;
			this.age=newage;
			this.id=newid;
		
		}


	public String getName( String Stu_name) {
		return this.name=Stu_name;
	}


	public void setName(String Stu_name) {
		this.name = Stu_name;
	}
	
	public int getAge(int newage) {
		return newage;
	}


	public void setAge(int newage) {
		this.age = newage;
	}
	
	public int getId(int newid) {
		return newid;
	}


	public void setId(int newid) {
		this.id = newid;
	}
	public String tostring(){
		return("name is"+this.name+"age is"+this.age+"id is"+this.id);
			
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayListOBJ S1=new ArrayListOBJ("Jaya",15,1);
		//System.out.println(S1);
		ArrayListOBJ S2=new ArrayListOBJ("john",16,2);
		ArrayListOBJ S3=new ArrayListOBJ("Tom",15,3);
		ArrayListOBJ S4=new ArrayListOBJ("Ben", 14,4);
		ArrayListOBJ S5=new ArrayListOBJ("car",15,5);
		
		ArrayList Student= new ArrayList();
		Student.add(S1);
		Student.add(S2);
		Student.add(S3);
		Student.add(S4);
		Student.add(S5);
		System.out.println(Student);
		
		Iterator obj=Student.iterator();
		
		while(obj.hasNext()){
			System.out.println(obj.next().toString());
		}

	}
}
