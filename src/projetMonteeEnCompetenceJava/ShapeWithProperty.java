package projetMonteeEnCompetenceJava;

public class ShapeWithProperty {
	
	public ShapeProperty property;
	public Shape shape;
	
	ShapeWithProperty(Shape shape, ShapeProperty property){
		this.property = property;
		this.shape = shape;
	}
	
}