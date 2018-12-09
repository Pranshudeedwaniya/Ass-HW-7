package hw7;

/**
 * exception specifying that user has enered wrong pin
 * exception constructor takes user string as input to print that message
 * @author Pranshu
 *
 */

public class wrong_pin_exception extends Exception {

	public wrong_pin_exception(String s)
	{
		super(s);
	}
	
}
