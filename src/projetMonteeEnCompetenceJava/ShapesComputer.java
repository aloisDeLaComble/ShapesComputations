package projetMonteeEnCompetenceJava;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/a")
public class ShapesComputer {

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String sayPlainTextHello() {
    return "Hello Jersey TEXT PLAIN";
  }

  @GET
  @Produces(MediaType.TEXT_XML)
  public String sayXMLHello() {
    return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey XML" + "</hello>";
  }

  @GET
  @Produces(MediaType.TEXT_HTML)
  public String sayHtmlHello() {
	
    return "<html> " + "<title>" + "Shapes Computer" + "</title>"
        + "<body>" + "a"  + "</body>" + "</html> ";
  }

} 