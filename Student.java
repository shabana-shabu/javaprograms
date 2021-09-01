import java.util.*;
	class StudentDetails
	{
		int roll;
		String name;
		float marks;
		void getdata()
		{
			Scanner scan = new Scanner(System.in);
			System.out.print("\nEnter the Roll = ");
			roll=scan.nextInt();
			scan.nextLine();
			System.out.print("\nEnter the NAME = ");		
			name=scan.nextLine();
					
			System.out.print("\nEnter the MARKS = ");
			marks=scan.nextFloat();
		}
		void display()
		{
			System.out.println("______________________");
			System.out.println("ROLL   = " + roll);
			System.out.println("NAME   = " + name);
			System.out.println("MARKS  = " + marks);
			
		}
	}
	public class Student {
		public static void main(String[] args) {
			StudentDetails stu = new StudentDetails();		
			stu.getdata();
			stu.display();
		}
	}

