package shapesInConsole;

import java.util.ArrayList;
import java.util.Scanner;

import shapesInJava.Point;
import shapesInJava.Shape;
import shapesInJava.ShapeFactory;
import shapesInJava.UnhandledNumberOfPointsException;
import shapesInJava.Point.coordinates;

public class ShapeFactoryFromConsole {
	
	public static Shape createShapeFromConsole() throws UnhandledNumberOfPointsException {	
		ArrayList<Point> points = getPointsFromConsole();
		return ShapeFactory.createShapeFromPoints(points);
	}
	
	private static ArrayList<Point> getPointsFromConsole(){
		boolean userDidNotEnterEnd = true;
		ArrayList<Point> points = new ArrayList<Point>();
		Scanner scanner = new Scanner(System.in);
		while(userDidNotEnterEnd){
			String stringX = PointFactoryFromConsole.getCoordinatesFromUser(coordinates.xAxis, scanner);
			String stringY = PointFactoryFromConsole.getCoordinatesFromUser(coordinates.yAxis, scanner);
			PointFactoryFromConsole.addNewPointIfCoordinatesValid(points, stringX, stringY);
		}
		scanner.close();
		return points;
	}
	
}
