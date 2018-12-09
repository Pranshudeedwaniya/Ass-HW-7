package hw7;

/**
 * exception specifying that ther is insufficient balance in user account
 * exception constructor takes no argument print this message
 * @author Pranshu
 *
 */

public class insufficient_balance_exception extends Exception {

	public insufficient_balance_exception(){
		super("Insufficient balance, you cannot withdraw money!!");
	}
	
}