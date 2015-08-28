package projetMonteeEnCompetenceJava;

public class UnhandledNumberOfPointsException extends Exception {
	public UnhandledNumberOfPointsException(){
	     super("The shape type corresponding to the number of points you have entered can not be handled by this program.");
	  }
}
