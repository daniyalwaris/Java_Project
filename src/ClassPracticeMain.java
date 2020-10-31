
public class ClassPracticeMain {
	
	public static void main(String[] args)
	{
		ClassPractice triangleA = new ClassPractice(15, 8, 15,8,17);
		ClassPractice triangleB = new ClassPractice(3, 2, 3,3,3);
		
		double triangleArea = triangleA.findArea();
		System.out.println(triangleArea);
		
	}
	
}
