package shapesInJava;

public class ShapeWithProperty {
	
	public ShapeProperty property;
	public Shape shape;
	
	public ShapeWithProperty(Shape shape, ShapeProperty property){
		this.property = property;
		this.shape = shape;
	}
	
}