package hw7;

import java.util.*;

public class lotteryuser {

	public static void main(String[] args) {
		lottery lot=new lottery();
		Scanner in=new Scanner(System.in);
		int loteryno[]=new int [5];
		
		//taking input from user i.e., his lottery no
		
		System.out.println("enter 5 single digit numbers to check lottery ");
		for(int i=0;i<loteryno.length;i++)
			{
				int key=in.nextInt();
				loteryno[i]=key;
				if(key<0||key>9)
				{
					System.out.println("incorrect,try again");
					i--;
				}
			}
		//checking user lottery no to original lottery no
		
		int count=lot.checkmatch(loteryno);
		System.out.println(count+" digits matched");
		if(count==5)
			System.out.println("congratulation!!you are a grand prize winner");
		System.out.println("original lottery number was ");
		int [] copylottery=new int[5];
		
		//retrieving a copy of original lottery no
		
		copylottery=lot.copyarray();
		for(int i=0;i<copylottery.length;i++)
		{
			System.out.print(copylottery[i]+" ");
		}
		in.close();
		}

}
