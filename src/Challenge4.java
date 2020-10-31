import java.util.Scanner;

public class Challenge4
{
	String FirstName;
	String LastName;
	int ExptYrGrad;
	double GPA;
	String declMaj;
	
	
	public Challenge4(String FirstName,String LastName,int ExptYrGrad,double GPA,String declMaj)
	{
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.ExptYrGrad = ExptYrGrad;
		this.GPA = GPA;
		this.declMaj = declMaj;
		
	}
	
	 public int IncrementExpectedGraduationYear()
	 {
		 return(this.ExptYrGrad+1);
	 }

	 
 }

