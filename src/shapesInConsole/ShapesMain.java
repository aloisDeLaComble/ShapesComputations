package shapesInConsole;

import shapesInJava.Shape;
import shapesInJava.UnhandledNumberOfPointsException;

import javax.swing.JOptionPane;

public class ShapesMain {

	public static void main(String[] args) {
		try{
		Shape shape1 = ShapeFactoryFromConsole.createShapeFromConsole();
		String[] computableShapeParameters = {"Perimeter","Area"};
		Integer defaultChoiceID = 0;
		String parameterToPrint = (String)JOptionPane.showInputDialog(null, 
			      "What would you like to know about this shape ?",
			      "Geometry calculus",
			      JOptionPane.QUESTION_MESSAGE,
			      null,
			      computableShapeParameters,
			      computableShapeParameters[defaultChoiceID]);
		
		if(parameterToPrint.equals(computableShapeParameters[0])){
			shape1.perimeterToString();
		}
		if(parameterToPrint.equals(computableShapeParameters[1])){
			shape1.areaToString();
		}
		
		}
		catch(UnhandledNumberOfPointsException exception)
		{
			System.out.println(exception.getMessage());
		}
		
	}
	
	

}
