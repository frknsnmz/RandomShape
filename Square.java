
public class Square extends Shape{
	
	private int size;
	
	public Square(CordPt loc, int size) // const.
	{
		// TODO Auto-generated constructor stub
		super(loc);
		this.size=size;
	}

	@Override
	public String thisIsa(IShape shape) 
	{
		// TODO Auto-generated method stub
		return "Square";
	}

	@Override
	public double area() // area of square formula
	{
		// TODO Auto-generated method stub
		return size*size;
	}

	@Override
	public boolean isFullShape(CordPt p) // full shape or not foormula
	{
		// TODO Auto-generated method stub
		if(distanceToCoordinateCenter()> size+p.getX())
		{
			return true;
		}

		return false;
	}

	@Override
	public String propertiesOfShape() // prop. of shapes.
	{
		// TODO Auto-generated method stub
		return "The size of the square : " + size;
	}

	@Override
	public String shapeId() // ID of shape with the code.
	{
		// TODO Auto-generated method stub
		return "S" + random();
	}

}
