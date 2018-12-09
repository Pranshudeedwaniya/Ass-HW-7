package hw7;

/**
 * exception specifying that user has chosen an invalid option
 * exception constructor takes user string as input to print that message
 * @author Pranshu
 *
 */

public class invalid_option_exception extends Exception {

	public invalid_option_exception(String s)
	{
		super(s);
	}
	
}
