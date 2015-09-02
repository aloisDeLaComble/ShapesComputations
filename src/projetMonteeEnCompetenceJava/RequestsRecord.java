package projetMonteeEnCompetenceJava;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;

@Path("/requestrecord")
public class RequestsRecord {

		  ShapesDAO shapesDAO = ShapesDAOsAdministrator.getShapesDAO(1);


		  @Context
		  UriInfo uriInfo;
		  @Context
		  Request request;
		  
		  @GET
		  @Produces(MediaType.APPLICATION_JSON)
		  public Response DisplayWholeRecord() {
			  return Response.ok().entity(shapesDAO).build();
		  }
		  
		  @GET
		  @Produces(MediaType.APPLICATION_JSON)
		  @Path("/{firstId}/{lastId}")
		  public Response DisplayRecordBetweenIds(
				  @PathParam("firstId") Integer firstId,
				  @PathParam("lastId") Integer lastId){
			  return RecordBetweenIdsToString(firstId,lastId);
		  }
		  
		 private Response RecordBetweenIdsToString(Integer firstId, Integer lastId){
			 return Response.ok().entity(shapesDAO.getLastShapeWithProperty().property).build();
		 }
		 
		 
	}

