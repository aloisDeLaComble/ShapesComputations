package projetMonteeEnCompetenceJava;

import java.util.ArrayList;
import java.util.Scanner;

import projetMonteeEnCompetenceJava.Point.coordinates;

public class ShapeFactoryFromConsole {
	
	public static Shape createShapeFromConsole() throws UnhandledNumberOfPointsException {	
		ArrayList<Point> points = getPointsFromConsole();
		return ShapeFactory.createShapeFromPoints(points);
	}
	
	private static ArrayList<Point> getPointsFromConsole(){
		boolean userDidNotEnterEnd = true;
		ArrayList<Point> points = new ArrayList();
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
