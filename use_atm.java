package hw7;
import java.util.*;

public class use_atm {

	public static void main(String[] args) {
		
		int i,userid,pass,j=-1;
		long termination_time,start_time;
		
		Scanner in=new Scanner(System.in);
				
		table t[]=new table[10];	
		
		System.out.println("enter number of entries you want in table ");
		int n=in.nextInt();
		
		System.out.println("fill entries in table to proceed transaction between them ");
		
		for(i=0;i<n;i++)
		{
			t[i]=new table();
		}
		//loop to continue processes of atm transcation
		sos: while(true) {
			
			System.out.println();
			System.out.println("enter 1 to withdraw amount");
			System.out.println("enter 2 to deposit amount");
			System.out.println("enter 3 to check balance");
			System.out.println("enter 4 to exit");
			System.out.println("enter your choice: ");
			start_time=System.currentTimeMillis();
			i=in.nextInt();
			termination_time=System.currentTimeMillis();
			
			//check for timeout
			
			try {
				if(termination_time-start_time>10000)
					throw(new timeout_exception("transaction timeout!!"));
				
			}
			catch(timeout_exception e) {
				System.out.println(e.getMessage());
			}

			
			try {
			if(i<=0||i>4)
				throw (new invalid_option_exception("you entered wrong choice, try again"));
			
			System.out.println("enter userid ");
			userid=in.nextInt();
			start_time=System.currentTimeMillis();
			System.out.println("enter password ");
			pass=in.nextInt();

			termination_time=System.currentTimeMillis();
			
			try {
				if(termination_time-start_time>10000)
					throw(new timeout_exception("transaction timeout!!"));
					
			}
			catch(timeout_exception e) {
				System.out.println(e.getMessage());
				continue sos;
			}
			for(int k=0;k<n;k++)
			{
				if(t[k].getid()==userid)
					{
						j=k;
						break;
					}
			}
			if(j==-1)
				throw(new invalid_id_exception("wrong id enterd!!"));
			if(t[j].getpassword()!=pass)
				throw(new wrong_pin_exception("wrong pin entered!!\n"));
			}
			catch(invalid_option_exception e){
				System.out.println(e.getMessage());}
			catch(wrong_pin_exception e) {
				System.out.println(e.getMessage());}
				catch(invalid_id_exception e) {
					System.out.println(e.getMessage());
				}
			
			switch(i)
			{
			//withdraw
			
			case 1:
				
				System.out.println("enter bank from which you want to withdraw money ");
				String name=in.next();
				try {
					if(t[j].getcount()>3)
						throw(new inter_bank_transactions_exception("number of inter-bank transaction exceeded 3"));
				}
				catch(inter_bank_transactions_exception e)
				{
					System.out.println(e.getMessage());
				}
				System.out.println("enter amount to withdraw ");
				int amount=in.nextInt();
				if(!(t[j].getbank_name().equals(name)))
					t[j].setcount();
				t[j].withdraw(amount);
				
				break;
			case 2:
				//deposit
				
				System.out.println("enter bank in which you want to deposit money ");
				name=in.next();
				try {
					if(t[j].getcount()>3)
						throw(new inter_bank_transactions_exception("number of inter-bank transaction exceeded 3"));
					if(!(t[j].getbank_name().equals(name)))
						t[j].setcount();
					System.out.println("enter amount to deposit ");
					amount=in.nextInt();
					t[j].deposit(amount);
				}
				catch(inter_bank_transactions_exception e)
				{
					System.out.println(e.getMessage());
				}
				
					
				
				break;
			case 3:
				
				// check balance
				t[j].checkbalance();
				break;
			case 4:
				break sos;
			default:
				System.out.println("you entered wrong choice,try again");
			}
		}
		
		in.close();

	}

}
