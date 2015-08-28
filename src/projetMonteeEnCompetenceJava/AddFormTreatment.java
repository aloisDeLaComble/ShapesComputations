package projetMonteeEnCompetenceJava;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;



@Path("/addformtreatment")
public class AddFormTreatment {


  @Context
  UriInfo uriInfo;
  @Context
  Request request;
  
  @GET
  @Produces(MediaType.TEXT_HTML)
  public String sayHtmlHellooooo() {
    return "<html> " + "<title>" + "No data sent" + "</title>"
        + "<body><h1>" + "No data was sent !" + "</body></h1>" + "</html> ";
  }
  
  // This method is called if TEXT_PLAIN is request
  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String sayPlainTextHello() {
    return "No data was sent !";
  }

  // This method is called if XML is request
  @GET
  @Produces(MediaType.TEXT_XML)
  public String sayXMLHello() {
    return "<?xml version=\"1.0\"?>" + "<error> No data was sent ! </error>";
  }

  
  @POST
  @Produces(MediaType.TEXT_HTML)
  @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
  public String addShapeWithProperty(
  @FormParam("x1") Double x1,
  @FormParam("y1") Double y1,
  @FormParam("x2") Double x2,
  @FormParam("y2") Double y2,
  @FormParam("x3") Double x3,
  @FormParam("y3") Double y3,
  @FormParam("x4") Double x4,
  @FormParam("y4") Double y4,
  @FormParam("propertyToCompute") String propertyToCompute,
  
  @Context HttpServletResponse servletResponse) throws IOException {
  ArrayList<Point> points = new ArrayList<Point>();

  Point point1 = new Point(x1,y1);
  Point point2 = new Point(x2,y2);
  Point point3 = new Point(x3,y3);
  Point point4 = new Point(x4,y4);

  points.add(point1);
  points.add(point2);
  points.add(point3);
  points.add(point4);
  
  Shape shape = null;

try {
shape = ShapeFactory.createShapeFromPoints(points);
} catch (UnhandledNumberOfPointsException e) {

// TODO Auto-generated catch block
e.printStackTrace();

}

 

  Double propertyValue;
  ShapeProperty property = null;
  if(propertyToCompute.equals("Perimeter")){
	  propertyValue = shape.perimeter();
	  property = new ShapeProperty(ShapeProperty.propertyTypes.perimeter, propertyValue); 
  }

  if(propertyToCompute.equals("Area")){
	  propertyValue = shape.area();
	  property = new ShapeProperty(ShapeProperty.propertyTypes.area, propertyValue); 
  }


  ShapesDAO.addShapeWithProperty(shape, property);
  return property.toString();
		
  }


  
  

  
	
}
