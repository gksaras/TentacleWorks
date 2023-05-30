package xample;

public class CsvValidationException extends Throwable {

	@Override
	public String getMessage() {
		
		String msg = "CsvValidationException";
		return msg;
	}
}
