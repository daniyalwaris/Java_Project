
public class ClassPractice 
{
	double base;
	double height;
	double sidelineOne;
	double sidelinetwo;
	double sidelinethree;
	
	public ClassPractice(double base, double height,double sidelineOne,double sidelinetwo
			,double sidelinethree)
	{
	 this.base = base;
	 this.height= height;
	 this.sidelineOne = sidelineOne;
	 this.sidelinetwo = sidelinetwo;
	 this.sidelinethree = sidelinethree;		
	}
	
	public double findArea()
	{
		return(this.base * this.height)/2;
	}
	
}


