package homework;

public class TooHotException extends TemperatureException{


	public TooHotException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	public TooHotException() {
		super("Cup of coffee is to hot");
	
	}
	private static final long serialVersionUID = -1026562524791871634L;

}
