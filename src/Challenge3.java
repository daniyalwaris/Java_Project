import java.util.Scanner;

public class Challenge3 
{
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter the work Hours Per week");
		double no_work_Hrs_per_week = input.nextDouble();
		
		System.out.println("Enter the amount per hours");
		double money_per_Hrs = input.nextDouble();
	
		System.out.println("Enter the vacation days");
		double vacation_days = input.nextDouble();
	
		double salary = CalCulateVacationDay(vacation_days, money_per_Hrs, no_work_Hrs_per_week);
		System.out.println(salary);
		
		
		
		
				
	}
	
	
	public static double CalCulateVacationDay(double vaction, double money_per_Hrs,double no_work_Hrs_per_week)
	{
		double weeklypaychecks = no_work_Hrs_per_week * money_per_Hrs;
		double unpaidtime = vaction*money_per_Hrs*8;
		
	   return (weeklypaychecks*52)-unpaidtime;
		
	}
	
	
	
}
