package hw7;

/**
 * exception specifying that user has entered wrong id
 * exception constructor takes user string as input to print that message
 * @author Pranshu
 *
 */

public class invalid_id_exception extends Exception {

	public invalid_id_exception(String s) {
		super(s);
	}
	
}
