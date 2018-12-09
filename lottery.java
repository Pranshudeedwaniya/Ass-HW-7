package hw7;

import java.util.Random;

public class lottery {

	int lotteryno[]=new int [5];//array of integer single digit number which hold randomly generated integers
	/**
	 * constructor to initialize array values randomly
	 */
	public lottery() {
		Random rndm=new Random();
		for(int i=0;i<lotteryno.length;i++)
			lotteryno[i]=rndm.nextInt(10);
	}
	/**
	 * function to check randomly generated lottery no and user lottery no and return no of matched digits
	 */
	public int checkmatch(int userarr[])
	{
		int count=0;
		for(int i=0;i<lotteryno.length;i++)
		{
			if(lotteryno[i]==userarr[i])
				{
					count++;
				}
		}
		return count;
	}
	/**
	 * function toreturn copy of randomly generated array that is original lottery no
	 * @return
	 */
	public int[] copyarray()
	{
		int []copyarr=lotteryno.clone();
		return copyarr;
	}
	
}
