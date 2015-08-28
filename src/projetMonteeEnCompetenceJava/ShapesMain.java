package projetMonteeEnCompetenceJava;

import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;
import javax.swing.JOptionPane;

public class ShapesMain {

	public static void main(String[] args) {
		try{
		Shape shape1 = ShapeFactoryFromConsole.createShapeFromConsole();
		String[] computableShapeParameters = {"Perimeter","Area"};
		Integer defaultChoiceID = 0;
		JOptionPane jOptionPane = new JOptionPane();
		String parameterToPrint = (String)jOptionPane.showInputDialog(null, 
			      "What would you like to know about this shape ?",
			      "Geometry calculus",
			      JOptionPane.QUESTION_MESSAGE,
			      null,
			      computableShapeParameters,
			      computableShapeParameters[defaultChoiceID]);
		
		if(parameterToPrint.equals(computableShapeParameters[0])){
			shape1.perimeterToString();
		}
		if(parameterToPrint.equals(computableShapeParameters[1])){
			shape1.areaToString();
		}
		
		}
		catch(UnhandledNumberOfPointsException exception)
		{
			System.out.println(exception.getMessage());
		}
		
	}
	
	private static URI getBaseURI() {
	    return UriBuilder.fromUri("http://localhost:8080/ShapesComputations").build();
	  }	

}
