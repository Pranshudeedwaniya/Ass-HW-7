package hw7;

/**
 * exception specifying that inter-bank-transaction has exceeded it's limit of three
 * exception constructor takes user string as input to print that message
 * @author Pranshu
 *
 */

public class inter_bank_transactions_exception extends Exception {

	public inter_bank_transactions_exception(String s)
	{
		super(s);
	}
	
}
