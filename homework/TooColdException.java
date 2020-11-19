package homework;

public class TooColdException extends TemperatureException{

	public TooColdException() {
		super("Cup of coffee is to cold");
	}

	public TooColdException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = -1691679679240824190L;

}
