package programs;
//WJP to sore the student objects like name ,marks and ID
public class Student {
	private String stu_name;
	private int stu_marks;
	private int stu_id;
	
	public Student()
	{
		
	}
	public Student(String name, int marks,int id)
	{
		//System.out.println(name + "  "+ age);
		this.stu_name=name;//this means it is referring to current object or value.and if you this. then do not mention static in the method.
		this.stu_marks=marks;
		this.stu_id=id;
	}

/*	public Student(int salary, int age)
	{
		//System.out.println(salary + "  "+ age);
	}*/
	
	public void object(String name,int marks,int id){
		this.stu_name=name;//this means it is referring to current object or value.and if you this. then do not mention static in the method.
		this.stu_marks=marks;
		this.stu_id=id;
		
		
	}

	

	public void setStu_name(String name) {
		this.stu_name = name;
	}
	
	public String getStu_name() {
		return this.stu_name;
	}
	

	public void setStu_marks(int marks) {
		this.stu_marks = marks;
	}
	
	public int getStu_marks() {
		return this.stu_marks;
	}

	public int getStu_id() {
		return this.stu_id;
	}

	public void setStu_id(int id) {
		this.stu_id = id;
	}
	
	public String tostring(){
		return "student name is "+this.stu_name+"student id is"+this.stu_id+"student marks are"+this.stu_marks;
	}
	

}
