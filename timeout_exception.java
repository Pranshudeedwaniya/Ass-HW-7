package hw7;

/**
 * exception specifying timeout of transaction has taken place
 * exception constructor takes user string as input to print that message
 * @author Pranshu
 *
 */

public class timeout_exception extends Exception {

	public timeout_exception(String s)
	{
		super(s);
	}
	
}
