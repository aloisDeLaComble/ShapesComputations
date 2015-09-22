package shapesInJava;

public class UnhandledNumberOfPointsException extends Exception {
	private static final long serialVersionUID = 1L;

	public UnhandledNumberOfPointsException(){
	     super("The shape type corresponding to the number of points you have entered can not be handled by this program.");
	  }
}
