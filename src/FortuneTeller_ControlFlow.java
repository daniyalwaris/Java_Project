import java.util.Scanner;

public class FortuneTeller_ControlFlow
{
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		boolean isRequest = true;
		
		while(isRequest)
		{
			System.out.println("Playing the current song");
			System.out.println("Would you like to take this song off of repeat? If so, answer yes ");
			String userInput = input.next();
			
			if(userInput.equals("yes"))
			{
				isRequest = false;
			}
			
		}
	System.out.println("Playing next song");
	
		
	}
	

}
