import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Test{

	private static final String CIRCLE = "Circle";
	private static final String SQUARE = "Square";
	private static final String RECTANGLE = "Rectangle";
	private static final String SHAPE = "Shape";
	private List<Shape> Listem = new ArrayList<>();

	// Random Shape Creator. with switch case strategy
	private void Randomfs(int dice, List<Shape> a, String t)
	{
		for(int i=0; i<dice; i++){
			int fs = (int)(Math.random() * 3);
			int b  = (int)(Math.random() * 200);
			int c  = (int)(Math.random() * 200);
			int d  = (int)(Math.random() * 200);
			int y  = (int)(Math.random() * 200);

			switch (t) {
				case SHAPE:
					if (fs == 1) {
						Circle c1 = new Circle(new CordPt(c, b), d);
						a.add(c1);
					} else if (fs == 2) {
						Square s = new Square(new CordPt(c, b), d);
						a.add(s);
					} else {
						Rectangle r = new Rectangle(new CordPt(c, b), d, y);
						a.add(r);
					}
					break;
				case CIRCLE: {
					Circle s = new Circle(new CordPt(d, y), b);
					a.add(s);
					break;
				}
				case RECTANGLE: {
					Rectangle s = new Rectangle(new CordPt(d, y), b, c);
					a.add(s);
					break;
				}
				case SQUARE: {
					Square s = new Square(new CordPt(d, y), b);
					a.add(s);
					break;
				}
			}
		}
	} // end of the random shapes.

	//Here we are method actually its basic things for my project.
	private void HereweAre()
		{
			String[] pick = { "Create Random Shapes", "Circles", "Rectangles", "Squares", "Print All Shapes", "Print Circles", "Print Rectangles", "Print Squares" , "Exit"};
			String input = (String) JOptionPane.showInputDialog(null, "Select one of the options...",
					"The Main Menu", JOptionPane.QUESTION_MESSAGE, null,
					pick,
					pick[0]);
			
			// if users click cancel at the beg. of the project it won't give us error.
			if (input == null)
			{
				System.exit(0);
			}
				
			//Random shape is starting
			if(input.equals(pick[0])){
				Menu(SHAPE);
			}//Random Shape end


			//Random Circle is starting
			if(input.equals(pick[1])){
				Menu(CIRCLE);
			}//end of circle


			//Rectangle selected
			if(input.equals(pick[2])){
				Menu(RECTANGLE);
			}//Rectangle end


			//Square selected
			if(input.equals(pick[3])){
				Menu(SQUARE);
			}//Square end


			//Print all of them
			if(input.equals(pick[4])){
				System.out.printf("%-10.5s",  "Id" );
				System.out.printf("%-14.5s",  "Type");
				System.out.printf("%-15.5s",  "Area");
				System.out.printf("%-15.9s",  "FullShape");
				System.out.printf("%-15.8s",  "Distance");
				System.out.printf("%-10.10s", "Properties");
				System.out.println();
				PrintFS("Random");
				HereweAre();
				System.exit(0);
			}//end of print


			//Print Circle
			if(input.equals(pick[5])){
				System.out.printf("%-10.5s",  "Id" );
				System.out.printf("%-14.5s",  "Type");
				System.out.printf("%-15.5s",  "Area");
				System.out.printf("%-15.9s",  "FullShape");
				System.out.printf("%-15.8s",  "Distance");
				System.out.printf("%-10.10s", "Properties");
				System.out.println();
				PrintFS(CIRCLE);
				HereweAre();
				System.exit(0);
			}


			//Print Rectangle
			if(input.equals(pick[6]))
			{
				System.out.printf("%-10.5s",  "Id" );
				System.out.printf("%-14.5s",  "Type");
				System.out.printf("%-15.5s",  "Area");
				System.out.printf("%-15.9s",  "FullShape");
				System.out.printf("%-15.8s",  "Distance");
				System.out.printf("%-10.10s", "Properties");
				System.out.println();
				PrintFS(RECTANGLE);
				HereweAre();
				System.exit(0);
			}

			//Print Square
			if(input.equals(pick[7])){
				System.out.printf("%-10.5s",  "Id" );
				System.out.printf("%-14.5s",  "Type");
				System.out.printf("%-15.5s",  "Area");
				System.out.printf("%-15.9s",  "FullShape");
				System.out.printf("%-15.8s",  "Distance");
				System.out.printf("%-10.10s", "Properties");
				System.out.println();
				PrintFS(SQUARE);
				HereweAre();
				System.exit(0);
			}
			System.exit(0);
		}//end of the method.
	
	// Option pane questions methods. Which will ask on the screen
	public void Menu(String t){
		if(Listem.size() >=1){
			int input3 = JOptionPane.showConfirmDialog(null,
					"Do You Want To Delete ?",
					"?",
					JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE);
			if(input3 == JOptionPane.YES_OPTION){
				Listem.clear();
				JFrame frame = new JFrame("Ex");
				String code = JOptionPane.showInputDialog(
						frame,
						"How Many "+ t+"s  Do You Want To Create?",
						"SHAPES",
						JOptionPane.WARNING_MESSAGE);

				int one= Integer.parseInt(code);
				Randomfs(one,Listem,t);
				int input2 = JOptionPane.showConfirmDialog(null,
						one +" "+ t+ "s are created",
						"TITLE",
						JOptionPane.DEFAULT_OPTION,
						JOptionPane.WARNING_MESSAGE);

				if(input2 == JOptionPane.OK_OPTION)
				{
					HereweAre();
				}
				System.exit(0);
			}

			else{
				JFrame frame = new JFrame("Ex");
				String code = JOptionPane.showInputDialog(
						frame,
						"How Many "+ t +"s Do You Wanto To Create?",
						"SHAPES",
						JOptionPane.QUESTION_MESSAGE);

				int one= Integer.parseInt(code);
				Randomfs(one,Listem,t);

				int input2 = JOptionPane.showConfirmDialog(null,
						one +" "+  t+ "s are created",
						"TITLE",
						JOptionPane.DEFAULT_OPTION,
						JOptionPane.WARNING_MESSAGE);
				if(input2 == JOptionPane.OK_OPTION)
				{
					HereweAre();
				}
				System.exit(0);
			}
		} 

		else{
			JFrame frame = new JFrame("Ex");
			String code = JOptionPane.showInputDialog(
					frame,
					"How Many "+ t +"s Do You Wanto To Create?",
					"SHAPES",
					JOptionPane.QUESTION_MESSAGE);
			int one= code != null ? Integer.parseInt(code) : 0;
			Randomfs(one, Listem,t);



			int input2 = JOptionPane.showConfirmDialog(null,
					one +" "+  t+ "s are created",
					"TITLE",
					JOptionPane.DEFAULT_OPTION,
					JOptionPane.WARNING_MESSAGE);
			if(input2 == JOptionPane.OK_OPTION)
			{
				HereweAre();
			}
			System.exit(0);
		}
	}// end of option pane questions.

	//Print Method.
	public void PrintFS(String s)
	{
		double ab =0;
		int count =0;
		for(int i = 0; i <Listem.size(); i++) {
			if(s.equals("Random"))
			{
				System.out.printf("%-10.5s", Listem.get(i).shapeId());
				System.out.printf("%-14.9s", Listem.get(i).thisIsa(Listem.get(i)));
				System.out.printf("%-15.3f", Listem.get(i).area());
				System.out.printf("%-15.5s", Listem.get(i).isFullShape(new CordPt(i, i)));
				System.out.printf("%-15.3f", Listem.get(i).distanceToCoordinateCenter());
				System.out.printf("%-10s", Listem.get(i).propertiesOfShape());
				System.out.println();
				ab = ab + Listem.get(i).area();
				count++;
			}
			else if(s.equals(Listem.get(i).thisIsa(Listem.get(i))))
			{
				System.out.printf("%-10.5s", Listem.get(i).shapeId());
				System.out.printf("%-14.9s", Listem.get(i).thisIsa(Listem.get(i)));
				System.out.printf("%-15.3f", Listem.get(i).area());
				System.out.printf("%-15.5s", Listem.get(i).isFullShape(new CordPt(100, 200)));
				System.out.printf("%-15.3f", Listem.get(i).distanceToCoordinateCenter());
				System.out.printf("%-10s", Listem.get(i).propertiesOfShape());
				System.out.println();
				ab = ab + Listem.get(i).area();
				count++;
			}
		}
		System.out.println();
		switch (s) {
			case "Random":
				System.out.print(count + " shapes have been listed and the area of all shapes is: ");
				break;
			case RECTANGLE:
				System.out.print(count + " rectangles have been listed and the area of all shapes is: ");
				break;
			case SQUARE:
				System.out.print(count + " squares have been listed and the area of all shapes is: ");
				break;
			case CIRCLE:
				System.out.print(count + " circles have been listed and the area of all shapes is: ");
				break;
		}
		System.out.printf("%-100.3f",ab);
		System.out.println();
		System.out.println();

	}//end of the print method.

	//Main 
	public static void main(String [] frknsnmz)
	{
		Test s = new Test();
		s.HereweAre();
	}// end of the main

}//end of the class.

																						// FS