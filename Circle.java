
public class Circle extends Shape{
	
	private int r;                     // here my private variable for circle.      
	final double pi = Math.PI;

	
	public Circle(CordPt loc, int r) // cnstr of circle.
	{
		super(loc);
		this.r = r;
	}

	@Override // That methods are include my Abstract shape class's methods
	public String thisIsa(IShape shape)    
	{
		// TODO Auto-generated method stub
		return "Circle";
	}

	@Override
	public double area() // including area of circle formula
	{
		// TODO Auto-generated method stub
		return pi * Math.pow(r, 2);
	}

	@Override
	public boolean isFullShape(CordPt p) // is a full shape or not ?
	{
		// TODO Auto-generated method stub
		if(distanceToCoordinateCenter()>r)
		{
			return true;
		}
			return false;
	}

	@Override
	public String propertiesOfShape() 
	{
		// TODO Auto-generated method stub
		return "The radius of circle is : " + r; // it will give us r circle on the screen
	}

	@Override
	public String shapeId() // it will give us shape id and code of shape
	{
		// TODO Auto-generated method stub
		return "C"	+ random();
	}

}
