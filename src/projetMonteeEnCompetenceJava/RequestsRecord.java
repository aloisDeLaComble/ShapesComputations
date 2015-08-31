package projetMonteeEnCompetenceJava;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
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
		  @Produces(MediaType.TEXT_HTML)
		  public String DisplayWholeRecord() {
			  return RecordBetweenIdsToString(1,shapesDAO.getLastIndex());
		  }
		  
		  @GET
		  @Path("/{firstId}/{lastId}")
		  @Produces(MediaType.TEXT_HTML)
		  public String DisplayRecordBetweenIds(
				  @PathParam("firstId") Integer firstId,
				  @PathParam("lastId") Integer lastId){
			  return RecordBetweenIdsToString(firstId,lastId);
		  }
		  
		 private String RecordBetweenIdsToString(Integer firstId, Integer lastId){
			 String tableToReturn = "<table><tr><th>Shape Id</th><th><Parameter Type</th><th>Parameter Value</th></tr>";
			  for(Integer id=firstId; id<=lastId; id++){
				  tableToReturn += "<tr>"
				  		+ "<td>"+ id + "<td>"
						+ "<td>" + shapesDAO.propertyTypeToString(id) + "</td>"
				  		+ "<td>" + shapesDAO.propertyValueToString(id) + "</td>"
				  		+ "</tr>";
			  }
			  return tableToReturn + "</table>";
		 }
	}

