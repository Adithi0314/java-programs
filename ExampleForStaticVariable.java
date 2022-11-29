package javaprograms;

class Student{  
	   int rollno;
	   String name;  
	   static String college ="JSS"; 
	  
	   Student(int r, String n){  
	   rollno = r;  
	   name = n;  
	   }  
	 
	   void display ()
	   {
		   System.out.println(rollno+" "+name+" "+college);
	   }  
	}

public class ExampleForStaticVariable {

	public static void main(String[] args) {
		 Student s1 = new Student(111,"Adithi");  
		 Student s2 = new Student(222,"Anu");  
		 Student s3=new Student(113,"BHANU");
		  
		 s1.display();  
		 s2.display(); 
		s3.display();

	}

}
