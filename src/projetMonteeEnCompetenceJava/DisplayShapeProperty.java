package projetMonteeEnCompetenceJava;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;

@Path("/displayshapeproperty")
public class DisplayShapeProperty {

	  ShapesDAO shapesDAO = ShapesDAOsAdministrator.getShapesDAO(1);


	  @Context
	  UriInfo uriInfo;
	  @Context
	  Request request;
	  
	  
	  @GET
	  @Path("/{shapeId}/Perimeter")
	  @Produces(MediaType.TEXT_HTML)
	  public String DisplayShapePerimeter(
			  @PathParam("shapeId") Integer shapeId) {
		  Double perimeter = shapesDAO.getPerimeter(shapeId);
		  return "The shape whose id is " + shapeId + " has the following perimeter, " + perimeter;
	  }
	  
	  @GET
	  @Path("/{shapeId}/Area")
	  @Produces(MediaType.TEXT_HTML)
	  public String DisplayShapeArea(
			  @PathParam("shapeId") Integer shapeId) {
		  Double area = shapesDAO.getArea(shapeId);
		  return "The shape whose id is " + shapeId + " has the following area, " + area;
	  }
	  
}
