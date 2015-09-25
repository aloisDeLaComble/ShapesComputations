package shapesWeb;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import shapesInJava.Point;

@Path("/requestsrecord")
public class RequestsRecord {

		ShapesDAO shapesDAO = ShapesDAOsAdministrator.getShapesDAO(1);


		  //@Context
		  //UriInfo uriInfo;
		  //@Context
		  //Request request;
		
		
		
	
		  
		  @GET
		  @Produces({MediaType.APPLICATION_JSON})
		  public Point DisplayWholeRecord() {
			  Point point = new Point(10.0,10.1);
			  return point;
		  }
		  
		  
		 
		 
	}

