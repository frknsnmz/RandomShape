
public interface IShape{
	
	// area of shapes
	public double area();
	
	// distance between (0,0) and the point used to draw a shape
	public double distanceToCoordinateCenter();
	
	abstract public boolean isFullShape(CordPt loc);
	
	public String thisIsa(IShape shape);
	
	// Retruns data such as: width, radius and size(if it is a squar) etc. 
	public String propertiesOfShape( );
	
	// Retruns shape ID. public 
	public String shapeId();
	
}
