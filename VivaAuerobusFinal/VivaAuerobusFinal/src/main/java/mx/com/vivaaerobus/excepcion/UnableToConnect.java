package mx.com.vivaaerobus.excepcion;

public class UnableToConnect extends AssertionError{
	private static final String UNABLE_TO_CONNECT_MESSAGE = "unable to connect";
	
	public static String getConnectionMessage() {
		return UNABLE_TO_CONNECT_MESSAGE;
	}
	
	//constructor que llama al constructor de la clase padre assertionError
	public UnableToConnect(String message, Throwable cause) {
		super(message, cause);
	}
}
