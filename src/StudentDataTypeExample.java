import java.util.Scanner;

public class StudentDataTypeExample {
	
	public static void main(String[] args) 
	{
		int studentAge = 15;
		double studentGPA = 3.75;
		int studentMarks;
		char studentFirstInitial = 'D';
		char studentLastInitial = 'L';
		boolean hasPerfectAttendance = true;
		String studentFullName = "daniyal waris";
		String  studentFirstName = "daniyal";
		String studentlastName = "waris";
		
		// In order to get the first inital from the string
		
		char nameinitial = studentFirstName.charAt(0);
		
		System.out.println(nameinitial);
		
		System.out.println(studentAge);
		System.out.println(studentFirstInitial);
		System.out.println(studentLastInitial);
		System.out.println(studentGPA);
		System.out.println(studentFirstName);
		System.out.println(studentlastName);	
		
		System.out.println("Enter the Student Marks");
		
		// This is the just the one type or way in order to get the value from user as input so using Scanner
		Scanner input = new Scanner(System.in);
		studentMarks = input.nextInt();
		
		System.out.println(studentFirstName + " " + studentlastName + " " + studentMarks);
		
	}
	

}
