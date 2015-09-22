package shapesInJava;

public class ShapeProperty {
	
	public propertyTypes propertyType;
	public double value;
	
	public static enum propertyTypes{
		area,
		perimeter
	}
	
	public ShapeProperty(propertyTypes propertyType, double value){
		this.propertyType = propertyType;
		this.value = value;
	}
	
	public String toString(){
		return "The shape property " + propertyTypeToString() + " is of " + propertyValueToString();
	}
	
	public String propertyTypeToString(){
		if(propertyType.equals(propertyTypes.area)){
			return "area";
		}
		else
		{
			return "perimeter";
		}
	}
	
	public String propertyValueToString(){
		return Double.toString(value);
	}
}
