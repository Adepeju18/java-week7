
public class Student {
	//variables: DataType variable = value;
int id;   //4bytes
String name;
double score;   //8bytes

//methods
public void display()
{
	System.out.println("Student ID:"+id);
	System.out.println("Student Name:"+name);
	System.out.println("Student Result:"+score);
}
//main method:starts executing class
public static void main(String[] args)
{
	//1.create student object: className obj=new ClassName();
	Student obj = new Student(); //constructor
	//2.set variable for student object
	obj.id = 101;
	obj.name = "Andy";
	obj.score = 90.89;
	
	//3.display data of Student object
	obj.display();
	System.out.println("--------------");
	//update student "Andy" with new score
	obj.score = 91.00;
	//display after update
	obj.display();
	System.out.println("-------------------");
	 
	Student obj2 = new Student();
	obj2.id = 102;
	obj2.name = "V";
	obj2.score = 80.90;
	obj2.display();
   }
}
