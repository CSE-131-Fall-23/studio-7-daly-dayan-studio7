package studio7;

class Rectangle 
{
	private double length;
	private double width;
	
	
	public Rectangle(double givenLength, double givenWidth)
	{
		length = givenLength;
		width = givenWidth;
	}
	
	public double getLength()
	{
		return(length);
	}
	
	public double getWidth()
	{
		return(width);
	}
	
	public double getPerimeter()
	{
		return((2*length)+(2*width));
	}
	
	public double getArea()
	{
		return(length*width);
	}
	
	public void compareRectangles(Rectangle A, Rectangle B)
	{
		if(A.getArea()<B.getArea())
		{
			System.out.println("The second rectangle is larger than the first rectangle.");
		}
		else
		{
			System.out.println("The first rectangle is larger than the second rectangle.");
		}
	}
	
	public void isSquare(Rectangle A)
	{
		if(A.getLength() == A.getWidth())
		{
			System.out.println("This rectangle is a square.");
		}
		else
		{
			System.out.println("This rectangle is not a square.");
		}
	}
}
