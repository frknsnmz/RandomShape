
public abstract class Shape implements IShape{
	
	private CordPt loc;
	
	public Shape(CordPt loc) // const.
	{
		this.loc =loc;
	}
	
	abstract public double area();	// Areas of shapes.
	
	public double distanceToCoordinateCenter() // its same for all shapes so not need to be a abstract.
	{
		return Math.sqrt((loc.getX()-0*(loc.getX()-0)+(loc.getY()-0)*loc.getY()-0));
	}
		
	public abstract boolean isFullShape(CordPt p);
	
	abstract public  String propertiesOfShape();// Retruns data such as: width, radius and size(if it is a squar) etc. 
	
	abstract public  String shapeId(); 	// Retruns shape ID. public 
	
	public int random() // my random method that i used for code of shapes.
	{
		int x =(int)(Math.random()*5000)+999;
		return x;
	}

}
