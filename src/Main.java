/**
GradTa will call GradStudent's constructor, and GradStudent's constructor will call Student constructor
From there it will execute the studnet's class readData() method and backtrace to the gradStudent's.


*/
public class Main {

	public static void main(String[] args)
	{
		GradTA ta = new GradTA();
		ta.print();
	}

}
