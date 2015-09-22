package shapesInJava;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Point {
	
	private double x;
	private double y;
	

	public Point(Double x,Double y){
		this.x = x;
		this.y = y;
	}
	
	public Point(String stringX, String stringY){
		this.x = Double.parseDouble(stringX);
		this.y = Double.parseDouble(stringY);
	}
	
	public static enum coordinates{
		xAxis,
		yAxis
	};
	
	
	public double getCoordinate(coordinates coordinate){
		if(coordinate == coordinates.xAxis){
			return x;
		}
		else{
			return y;
		}
	}
	
	
}
