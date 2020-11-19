package homework;

public class TemperatureException extends Exception{

	private static final long serialVersionUID = -7828900523044326076L;

	public TemperatureException(String message) {
		super(message);

	}

	public TemperatureException(String message, Throwable cause) {
		super(message, cause);
	}
  
}
