import java.util.Scanner;


public class Challenge1 {
	
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		
		String question = "Is it true, Operating system is the mother of the Computer System";
		String correctAnswer = "Yes";
		String Option1 = "Yes";
		String Option2 = "No";
		String Option3 =  "I don't know";
		
		System.out.println("Question 1:" + " " + question);
		System.out.println("Choose the option from below:");
		System.out.println("a:" + Option1 + " " + "b:" + Option2 + " " + "c:"+ Option3 );
		
		System.out.println("Please Enter the Answer and Press Enter");
		String userInput = input.next();
		
		if (Option1.equals(userInput.toLowerCase()) )
		{
			System.out.println("User Answer:" + userInput + " " + "Which is correct Answer");
		}
		else
			System.out.println("User Answer:" + userInput + " " + "Which is Incorrect Answer, Correct Answer:" + Option1);		
	}

}
