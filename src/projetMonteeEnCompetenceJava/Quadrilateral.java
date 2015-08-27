package projetMonteeEnCompetenceJava;

import java.util.ArrayList;

class Quadrilateral extends Shape {

	Quadrilateral(ArrayList<Point> points){
		super(points);
	}
	
	public double area() {
		return Math.sqrt( 4 * diagACSquared() * diagBDSquared() - Math.pow( sideBCSquared() + sideDASquared() - sideABSquared() - sideCDSquared(), 2) ) / 4;
	}
	
	private double sideABSquared(){
		return Math.pow(distance(points.get(0), points.get(1)),2);
	}
	
	private double sideBCSquared(){
		return Math.pow(distance(points.get(1), points.get(2)),2);
	}
	
	private double sideCDSquared(){
		return Math.pow(distance(points.get(2), points.get(3)),2);
	}
	
	private double sideDASquared(){
		return Math.pow(distance(points.get(3), points.get(0)),2);
	}

	private double diagACSquared(){
		return Math.pow(distance(points.get(0), points.get(2)),2);
	}
	
	private double diagBDSquared(){
		return Math.pow(distance(points.get(1), points.get(3)),2);
	}
	
}
