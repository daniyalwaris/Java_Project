import java.util.Scanner;
public class Challenge2 {
	
	public static void main(String[] args)
	{
				
		Scanner inputValues = new Scanner(System.in);
		
		System.out.println("Enter the Base Value");
		int base = inputValues.nextInt();
	
		
		while(base <= 0)
		{
			System.out.println("Value is less than 0 : Please Enter again the value");
			base = inputValues.nextInt();
			
		}
			
		System.out.println("Enter the Height Value");
		int height = inputValues.nextInt();
		
		while (height <= 0)
		{	
			System.out.println("Value is less than 0 : Please Enter again the value");
			height = inputValues.nextInt();
		}
		
		int area = (height * base)/2;
		 System.out.println("Total Area of the triangle:" + area);
		
		
	}

}
