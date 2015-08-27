package projetMonteeEnCompetenceJava;

import java.util.HashMap;
import java.util.Map;

public class ShapesDAO {
	  private static Map<Integer,ShapeWithProperty> shapeWithPropertyMap = new HashMap<>();
	  private static Integer lastIndex = 0;
	  
	  public static void addShapeWithProperty(ShapeWithProperty shapeWithProperty){
		  lastIndex += 1;
		  shapeWithPropertyMap.put(lastIndex,shapeWithProperty);
	  }
	  
	  public static void addShapeWithProperty(Shape shape, ShapeProperty property){
		  ShapeWithProperty shapeWithProperty = new ShapeWithProperty(shape,property);
		  lastIndex += 1;
		  shapeWithPropertyMap.put(lastIndex,shapeWithProperty);
	  }
	  
	  public static ShapeWithProperty getLastShapeWithProperty(){
		  return shapeWithPropertyMap.get(getLastIndex());
	  }
	  
	  private static Integer getLastIndex(){
		  return lastIndex;
	  }
	  


}
