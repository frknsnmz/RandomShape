
public class Rectangle extends Shape{
	
	private int width,length;

	public Rectangle(CordPt loc, int width, int length) // const. of rectangle
	{
		super(loc);
		this.width=width;
		this.length=length;
	}

	@Override
	public String thisIsa(IShape shape) 
	{
		// TODO Auto-generated method stub
		return "Rectangle";
	}

	@Override
	public double area() // area of rectangle formula
	{
		// TODO Auto-generated method stub
		return width*length;
	}

	@Override
	public boolean isFullShape(CordPt p) // full shape or not formula
	{
		// TODO Auto-generated method stub
		if(distanceToCoordinateCenter()> width+length)
		{
			return true;
		}

		return false;
	}

	@Override
	public String propertiesOfShape() // propertios of shape.
	{
		// TODO Auto-generated method stub
		return "The width is : " + width +"The height is : " + length;
	}

	@Override
	public String shapeId()
	{
		// TODO Auto-generated method stub
		return "R" + random();
	}

}
