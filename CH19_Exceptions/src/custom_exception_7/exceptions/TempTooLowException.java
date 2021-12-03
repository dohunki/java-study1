package custom_exception_7.exceptions;

public class TempTooLowException extends TempOutOfRangeException {
	private static final long serialVersionUID= 1L;
	
	public TempTooLowException(String message) {
		super(message);
	}

}
