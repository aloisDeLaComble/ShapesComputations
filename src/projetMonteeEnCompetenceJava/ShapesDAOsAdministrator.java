package projetMonteeEnCompetenceJava;

import java.util.HashMap;
import java.util.Map;

public class ShapesDAOsAdministrator {
	public static Map<Integer,ShapesDAO> shapesDAOMap = new HashMap<>();
	
	
	 public static ShapesDAO getShapesDAO(Integer shapesDAOId){
		 if(!shapesDAOMap.containsKey(shapesDAOId)){
			 ShapesDAO newShapesDAO = new ShapesDAO();
			 shapesDAOMap.put(1, newShapesDAO);
			 return shapesDAOMap.get(shapesDAOId);
		 }
		  return shapesDAOMap.get(shapesDAOId);
	  }
}
