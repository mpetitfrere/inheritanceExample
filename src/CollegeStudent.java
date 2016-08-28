
import java.util.*;

//SuperClass
class Student
{
	//Class variavles
	private String name;
	private String numOfCourses;
	private int    ssn;
	protected char gender;
	private Date   birthDate;
	
	//Constructor
	public Student()
	{
		readData();
		
	}
	
	//reads data from user
	private void readData()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Please input your name: ");
		name = scan.nextLine();
		System.out.print("Please input ssn: ");
		ssn = scan.nextInt();
		System.out.print("Male/Female (m/f): ");
		gender = scan.next().charAt(0);
		if(gender == 'm')
		{
			System.out.print("How many classes is he taking: ");
			numOfCourses = scan.next();
			System.out.print("Please enter his birthday \n");
			birthDate = new Date();	
		}
		else
		{
			System.out.print("How many classes is she taking: ");
			numOfCourses = scan.next();
			System.out.print("Please enter her birthday \n");
			birthDate = new Date();	
		}

	}
	//Print results from user
	public void print()
	{	
		if(gender == 'm'|| gender == 'M')
		{
			System.out.println("\nThe information you input was ");
			System.out.print(name + "'s ssn is: " + ssn + "." + "\n" );
			System.out.println("He is taking " + numOfCourses + " courses" + "." );
			System.out.print("His birthday is ");
			birthDate.print();
		}
		else
		{
			System.out.println("\nThe information you input was ");
			System.out.print(name + "'s ssn is: " + ssn + "." + "\n");
			System.out.println("She is taking " + numOfCourses + " courses" + ".");
			System.out.print("Her birthday is ");
			birthDate.print();
		}
	}
}// end of class Student

//GradStudent inherits 
class GradStudent extends Student
{
	private String  researchTopic;
	private String	advisor;
	
	public GradStudent()
	{
		//Calls Student constuctor
		super();
		readData();
	}
	private void readData()
	{
		if(gender == 'm' || gender == 'M')
		{
			Scanner scan=new Scanner(System.in);
			System.out.print("Please input his reasearch topic: ");
			researchTopic = scan.nextLine();
			System.out.print("Please input his reasearch advisor: ");
			advisor = scan.nextLine();
		}
		else
		{
			Scanner scan=new Scanner(System.in);
			System.out.print("Please input her reasearch topic: ");
			researchTopic = scan.nextLine();
			System.out.print("Please input her reasearch advisor: ");
			advisor = scan.nextLine();	
		}
			
	}//end
	public void print()
	{
		super.print();
		if(gender == 'm' || gender == 'M')
		{
			System.out.println("\nHis research topic is: " + researchTopic + "." );
			System.out.println("His advisor is: " + advisor + "." );
			
		}
		else
		{
			System.out.println("\nHer research topic is: " + researchTopic + "." );
			System.out.println("Her advisor is: " + advisor + "." );
		}
	}
}// end of class GradStudent

class GradTA extends GradStudent
{
	private String taCourse;
	private String taInstructor;
	private Date   hireDate;
	
	public GradTA()
	{//default super is called
		super();
		readData();
	}
	private void readData()
	{
		if(gender == 'm')
		{
			Scanner scan=new Scanner(System.in);
			System.out.print("Please enter his TA course: ");
			taCourse = scan.nextLine();
			System.out.print("Please enter his TA instructor: ");
			taInstructor = scan.nextLine();
			System.out.print("Please enter his hire date \n");
			hireDate = new Date();	
			
		}
		else
		{
			Scanner scan=new Scanner(System.in);
			System.out.print("Please enter her TA course: ");
			taCourse = scan.nextLine();
			System.out.print("Please enter her TA instructor: ");
			taInstructor = scan.nextLine();
			System.out.print("Please enter her hire date \n");
			hireDate = new Date();	
		}
	}
	public void print()
	{
		super.print();
		if(gender == 'm' || gender == 'M')
		{
			System.out.println("His TA is: " + taCourse + "." );
			System.out.println("His TA instructor is: " + taInstructor + "." );
			System.out.print("His hire date is ");
			hireDate.print();
			
		}
		else
		{
			System.out.println("Her TA is: " + taCourse + "." );
			System.out.println("Her TA instructor is: " + taInstructor + "." );
			System.out.print("Her hire date is ");
			hireDate.print();
		}
	}
}// end of class GradTA

class Date
{
	private int month; 
	private int day; 
	private int year;
	
	public Date()
	{	
		readData();
	}
	private void readData()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("       Please input month: ");
		month = scan.nextInt();
		System.out.print("       Please input day: ");
		day = scan.nextInt();
		System.out.print("       Please input year: ");
		year = scan.nextInt();
	}
	
	public void print()
	{
		System.out.print(month + "/" + day + "/" + year);
	}
	
	
}// end of class Date