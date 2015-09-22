package shapesInJava;

import java.util.ArrayList;

public abstract class ShapeFactory {
	

	public static Shape createShapeFromPoints(ArrayList<Point> points) throws UnhandledNumberOfPointsException {	
		if(points.size() == 3){
			return new Triangle(points);
		}
		else if(points.size() == 4){
			return new Quadrilateral(points);
		}
		else{
			throw new UnhandledNumberOfPointsException();
		}
	}
	

	
	
}
