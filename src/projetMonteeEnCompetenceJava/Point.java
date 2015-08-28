package projetMonteeEnCompetenceJava;
import java.util.Scanner;

import projetMonteeEnCompetenceJava.Point.coordinates;

public class Point {
	
	private double x;
	private double y;
	

	Point(Double x,Double y){
		this.x = x;
		this.y = y;
	}
	
	Point(String stringX, String stringY){
		this.x = Double.parseDouble(stringX);
		this.y = Double.parseDouble(stringY);
	}
	
	public static enum coordinates{
		xAxis,
		yAxis
	};
	
	
	public double getCoordinate(coordinates coordinate){
		if(coordinate == coordinate.xAxis){
			return x;
		}
		else{
			return y;
		}
	}
	
	
}
