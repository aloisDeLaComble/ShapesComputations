package projetMonteeEnCompetenceJava;

import java.util.Scanner;
import java.util.ArrayList;

import projetMonteeEnCompetenceJava.Point.coordinates;

public class PointFactoryFromConsole {
	
	public static String getCoordinatesFromUser(coordinates coordinate, Scanner scanner){
		printAskingForCoordinate(coordinate);
		String valueEnteredByUser = scanner.nextLine();
		return valueEnteredByUser;
	}
	
	public static void addNewPointIfCoordinatesValid(ArrayList<Point> points, String stringX, String stringY){
		Boolean areCoordinatesValid = checkIfCoordinatesEnteredByUserAreValid(stringX,stringY);
		if(areCoordinatesValid){
			Point pointToAdd = new Point(stringX,stringY);
			points.add(pointToAdd);
		}
	}
	
	private static boolean checkIfCoordinatesEnteredByUserAreValid(String stringX, String stringY){
		try{
			Double.parseDouble(stringX);
			Double.parseDouble(stringY);
			return true;
		}
		catch(Exception e){
			return false;
		}
	}
	
	


	
	private static void printAskingForCoordinate(coordinates coordinate){
		if(coordinate == coordinate.xAxis){
			System.out.println("Please enter a X axis coordinate or enter END");
		}
		else{
			System.out.println("Please enter a Y axis coordinate or enter END");
		}
	}
	

}
