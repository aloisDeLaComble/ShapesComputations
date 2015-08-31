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
	
	ShapesDAO shapesDAO;


	  @Context
	  UriInfo uriInfo;
	  @Context
	  Request request;
	  
	 // public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		//          handleRequest(req, res);
		  //    }

	  
	  @GET
	  @Path("/{name}")
	  @Produces(MediaType.TEXT_HTML)
	  public String sayHtmlHellooooo(
			  @PathParam("name") String name) {
		  
		//  return "<html><body><p> Hiiii,<br/> Welcome "+name+"</p></body></html>";
		  if(name.equals("oui")){
			return "oui";
		 }
		  else if(name.equals(null)){
			  return "name est nul";
		  }
		  else if(name.equals("")){
			  return "name est vide";
			  }
		  else{
		  return name;
		  }
		  
	  }
}
