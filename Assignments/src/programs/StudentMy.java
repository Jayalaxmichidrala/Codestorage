package programs;

public class StudentMy{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student("Vijay", 65, 101);//in student class we created a cons
		//s1.object("Vijay", 65, 101);
		//System.out.println(s1);
		
		Student s2=new Student();//here calling method.
		s2.object("Tom", 75, 2);
		
		Student s3=new Student();
		s3.object("Don", 80, 3);
		
		Student s4=new Student();
		s4.object("Tim", 90, 4);

		
		Student[] studentarray=new Student[5];
		studentarray[0]=s1;
		studentarray[1]=s2;
		studentarray[2]=s3;
		studentarray[4]=s4;
		
		for(int i=0;i<=studentarray.length;i=i+1){
			System.out.println(studentarray[i].tostring());
		}
		
		

	}

}
