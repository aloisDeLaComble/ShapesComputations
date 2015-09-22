package shapesInJava;

import java.util.ArrayList;

import shapesInJava.Point.coordinates;

public abstract class Shape {
	
	
	protected ArrayList<Point> points;
	
	
	Shape(ArrayList<Point> points){
		this.points = points;
	}
	

	public void areaToString(){
		System.out.println(Double.toString(area()));
	}
	
	
	public abstract double area();
	
	
	public void perimeterToString(){
		System.out.println(Double.toString(perimeter()));
	}
	
	
	public double perimeter(){
		Double perimeter = new Double(0);
		
		for(int pointId = 1; pointId < points.size(); pointId++){
			perimeter += distance(points.get(pointId), points.get(pointId-1));
		}
		
		Point firstPoint = points.get(0);
		Point lastPoint = points.get(points.size()-1);
		perimeter += distance(firstPoint, lastPoint);
		
		return perimeter;
	}
	
	
	protected double distance(Point pointA, Point pointB){
		Double xa = pointA.getCoordinate(coordinates.xAxis);
		Double xb = pointB.getCoordinate(coordinates.xAxis);
		Double ya = pointA.getCoordinate(coordinates.yAxis);
		Double yb = pointB.getCoordinate(coordinates.yAxis);
		return Math.sqrt( Math.pow( xa - xb ,2) + Math.pow( ya - yb , 2));
	}
}
