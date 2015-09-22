package shapesInJava;
import java.util.ArrayList;

class Triangle extends Shape {
	
	Triangle(ArrayList<Point> points){
		super(points);
	}

	public double area() {
		Double halfPerimeter = getHalfPerimeter();
		Double sideALength = getSideALength();
		Double sideBLength = getSideBLength();
		Double sideCLength = getSideCLength();
		return Math.sqrt(halfPerimeter * ( halfPerimeter - sideALength ) * (halfPerimeter - sideBLength) * (halfPerimeter - sideCLength));
	}
	
	private double getHalfPerimeter(){
		return this.perimeter()/2;
	}
	
	private double getSideALength(){
		return distance(points.get(0), points.get(1));
	}
	
	private double getSideBLength(){
		return distance(points.get(1), points.get(2));
	}
	
	private double getSideCLength(){
		return distance(points.get(2), points.get(0));
	}

}
