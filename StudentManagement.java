import java.util.ArrayList;
import java.util.Scanner;
class Student
{
int ID;
String name;
int marks;
 public Student(int ID,String name,int marks)
{
this.ID=ID;
this.name=name;
this.marks=marks;
}
public void display()
{
System.out.println("ID:"+ ID + "Name:"+ name + "Marks:"+ marks);
}
}
class StudentManagement
{
public static void main(String[] args)
{
	 ArrayList<Student> students=new ArrayList<>();
	 Scanner sc = new Scanner(System.in);
	 int choice;
	 do 
	 {
	 System.out.println("1. Add Student");
	 System.out.println("2. View Students");
	 System.out.println("3. Update Student");
	 System.out.println("4. Delete Student");
	 System.out.println("5. Exit");
	 System.out.println("Enter your choice");
	 choice =sc.nextInt();
	 
	 switch(choice)
	 {
	 case 1:
	  System.out.print("Enter ID: ");
	  int ID=sc.nextInt();
	  sc.nextLine();
	  System.out.println("Enter Name: ");
	  String name= sc.nextLine();
	  System.out.println("Enter Marks: ");
	  int marks=sc.nextInt();
	  students.add(new Student(ID,name,marks));
	  System.out.println("Student added successfully");
	  break;
	  case 2:
	  if(students.isEmpty())
	  {
		   System.out.println("No Students Found");
	  
	  }
	  else 
	  {
		  for(Student s: students)
		  {
			  s.display();
		  }
	  }
	  break;
	  case 3:
	  System.out.print("Enter ID of student to update: ");
      int updateID = sc.nextInt();
      boolean foundUpdate = false;
      for (Student s : students)
		  {
           if (s.ID == updateID)
			   {
                sc.nextLine();
                System.out.print("Enter new Name: ");
                s.name = sc.nextLine();
                System.out.print("Enter new Marks: ");
                s.marks = sc.nextInt();
                System.out.println("Student updated successfully!");
                foundUpdate = true;
                break;
			   }
		  }
		  if(!foundUpdate)
		  {
			  System.out.println("Student not found");
		  }
	  case 4:
	  System.out.println("Enter ID of student to delete: ");
	  int deleteID =sc.nextInt();
	  boolean removed =false;
	  for(int i=0;i<students.size();i++)
	  {
		  if(students.get(i).ID==deleteID)
		  {
			  students.remove(i);
			  System.out.println("Student deleted successfully");
			  removed=true;
			  break;
		  }
	  }
	  if(!removed)
	  { System.out.println("Student not found");
	  }
	  break;
	  case 5:
	  System.out.println("exit");
	  break;
	  default:
	  System.out.println("Invalid choice");
	 } 
	 }
	 while(choice!=5);
}
}