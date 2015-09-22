package shapesWeb;

import java.util.HashMap;
import java.util.Map;


import shapesInJava.Shape;
import shapesInJava.ShapeProperty;
import shapesInJava.ShapeWithProperty;

public class ShapesDAO {
	  private Map<Integer,ShapeWithProperty> shapeWithPropertyMap = new HashMap<>();
	  private Integer lastIndex = 0;
	  
	  ShapesDAO(){
		  this.shapeWithPropertyMap = new HashMap<>();
		  this.lastIndex = 0;
	  }
	 
	  
	  public void addShapeWithProperty(ShapeWithProperty shapeWithProperty){
		  lastIndex += 1;
		  shapeWithPropertyMap.put(lastIndex,shapeWithProperty);
	  }
	  
	  public void addShapeWithProperty(Shape shape, ShapeProperty property){
		  ShapeWithProperty shapeWithProperty = new ShapeWithProperty(shape,property);
		  lastIndex += 1;
		  shapeWithPropertyMap.put(lastIndex,shapeWithProperty);
	  }
	  
	  public ShapeWithProperty getLastShapeWithProperty(){
		  return shapeWithPropertyMap.get(getLastIndex());
	  }
	  
	  public Integer getLastIndex(){
		  return lastIndex;
	  }
	  
	  public Double getPerimeter(Integer shapeId){
		  return shapeWithPropertyMap.get(shapeId).shape.perimeter();
	  }
	  
	  public Double getArea(Integer shapeId){
		  return shapeWithPropertyMap.get(shapeId).shape.area();
	  }
	  
	  public String propertyTypeToString(Integer shapeId){
		  return shapeWithPropertyMap.get(shapeId).property.propertyTypeToString();
	  }
	  
	  public String propertyValueToString(Integer shapeId){
		  return shapeWithPropertyMap.get(shapeId).property.propertyValueToString();
	  }


}
