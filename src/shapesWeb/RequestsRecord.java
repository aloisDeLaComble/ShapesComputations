package shapesWeb;

import javax.ws.rs.GET;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response.ResponseBuilder;

import com.owlike.genson.Genson;
import com.owlike.genson.GensonBuilder;

import shapesInJava.Point;

@Path("/requestsrecord")
public class RequestsRecord {

		ShapesDAO shapesDAO = ShapesDAOsAdministrator.getShapesDAO(1);


		  //@Context
		  //UriInfo uriInfo;
		  //@Context
		  //Request request;
		
		
		
	
		  
		  @GET
		  //@Produces("application/json")
		  public String DisplayWholeRecord() {
			  //JSONObject obj = new JSONObject();
			  //obj.put("surface", "a");
			  //ResponseBuilder response = Response.ok().entity(obj.toString());
				//return (makeCORS(response));
			  System.out.println("On va faire un point");
			  Point point = new Point(10.0,10.1);
			  System.out.println("On va créer la variable genson");
			  Genson genson = null;
			  System.out.println("On va créer le gensonbuilder");
			  GensonBuilder gensonBuilder = new GensonBuilder();
			  System.out.println("On va créer l'objet genson");
			  genson = gensonBuilder.create();
			  System.out.println("On va sérialiser");
			  String retour = genson.serialize(point);
			  System.out.println("On va retourner");
			  return retour;
			  
		  }
		  
		 // private Response makeCORS(ResponseBuilder req) {
			//   ResponseBuilder rb = req
				//	   .header("Access-Control-Allow-Origin", "*")
					//   .header("Access-Control-Allow-Methods", "GET, POST, OPTIONS")
					  // .header("Access-Control-Allow-Headers", "content-type");
			  // return rb.build();
			//}
		  
		  
		 
		 
	}

