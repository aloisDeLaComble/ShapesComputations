package projetMonteeEnCompetenceJava;

public class ShapeProperty {
	
	public propertyTypes propertyType;
	public double value;
	
	public static enum propertyTypes{
		area,
		perimeter
	}
	
	ShapeProperty(propertyTypes propertyType, double value){
		this.propertyType = propertyType;
		this.value = value;
	}
	
	public String toString(){
		return "The shape property " + propertyTypeToString() + " is of " + Double.toString(value);
	}
	
	private String propertyTypeToString(){
		if(propertyType.equals(propertyTypes.area)){
			return "area";
		}
		else
		{
			return "perimeter";
		}
	}
}
