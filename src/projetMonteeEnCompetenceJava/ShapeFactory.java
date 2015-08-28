package projetMonteeEnCompetenceJava;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class ShapeFactory {
	
	public static Shape createShapeFromConsole() throws UnhandledNumberOfPointsException {	
		ArrayList<Point> points = getPointsFromConsole();
		return createShapeFromPoints(points);
	}
	
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
	
	private static ArrayList<Point> getPointsFromConsole(){
		boolean userDidNotEnterEnd = true;
		ArrayList<Point> points = new ArrayList();
		Scanner scanner = new Scanner(System.in);
		while(userDidNotEnterEnd){
			Point currentlyAddedPoint = new Point();
			userDidNotEnterEnd = currentlyAddedPoint.setCoordinatesFromUserEntriesReturnSuccess(scanner);
			if(userDidNotEnterEnd){
				points.add(currentlyAddedPoint);
			}
		}
		scanner.close();
		return points;
	}
	
	
}
