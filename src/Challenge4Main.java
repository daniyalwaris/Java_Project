
public class Challenge4Main {
	
	public static void main(String[] args)
	{
		Challenge4 Student1 = new Challenge4("Daniyal","Waris",4,2.78,"Computer Science");
		Challenge4 Student2 = new Challenge4("Mahek","Iftikhar",6,4.85,"MBBS");
		
		int IncrGraduationYear = Student2.IncrementExpectedGraduationYear();
		System.out.println(IncrGraduationYear);
	}
}
