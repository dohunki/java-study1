package custom_exception_7.exceptions;

public class TempTooHighException extends TempOutOfRangeException {
	private static final long serialVersionUID= 1L;
	
	public TempTooHighException(String message) {
		super(message);
	}

}
