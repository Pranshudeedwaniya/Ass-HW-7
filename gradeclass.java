package hw7;

import java.util.*;

public class gradeclass {

	//given instances
	
	ArrayList<String> al=new ArrayList<String>(); 
	char grades[]=new char[5];
	double stud1[]=new double[4];
	double stud2[]=new double[4];
	double stud3[]=new double[4];
	double stud4[]=new double[4];
	double stud5[]=new double[4];

	public gradeclass() {
		Scanner in=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("enter student "+(i+1)+" name: ");
			al.add(in.next());
			for(int j=0;j<4;j++)
			{
				System.out.println("enter marks of student "+(i+1)+" in test "+(j+1));
				double key=in.nextDouble();
				if(key<0||key>100) //checking marks range
				{
					System.out.println("invalid marks,try again");
					j--;
					continue;
				}
				/*
				 * matching student for which input is given
				 */
				if(i==0)
				{
					stud1[j]=key;
				}
				else if(i==1)
				{
					stud2[j]=key;
				}
				else if(i==2)
				{
					stud3[j]=key;
				}
				else if(i==3)
				{
					stud4[j]=key;
				}
				else if(i==4)
				{
					stud5[j]=key;
				}
			}
		}
		
		in.close();
	}
	/**
	 * function to finalise grades based on marks of student
	 * @param d
	 * @return
	 */
	public char grade(double d) {
		if(d>=90&&d<100)
			return 'A';
		else if(d>=80&&d<89)
			return 'B';
		else if(d>=70&&d<79)
			return 'C';
		else if(d>=60&&d<69)
			return 'D';
		else
			return 'E';
	}
	/**
	 * function returning average of a students' marks
	 * @param score
	 * @return
	 */
	public double calcaverage(double score[]) {
		
		double avg=0;
		
		for(int i=0;i<score.length;i++)
			avg+=score[i];
		
		avg=avg/4;
		
		return avg;
		
	}
	/**
	 * function to access name of student
	 * @param i
	 * @return
	 */
	public String getname(int i)
	{
		return al.get(i);
	}
	/**
	 * function which display student information by checking student no in arraylist
	 */
	public void display() {
		
		for(int i=0;i<al.size();i++)
		{
			if(i==0)
			{
				double avg=calcaverage(stud1);
				grades[i]=grade(avg);
				System.out.println("Student "+(i+1)+" "+getname(i)+" average "+avg+" grade "+grades[i]);
			}
			else if(i==1)
			{
				double avg=calcaverage(stud2);
				grades[i]=grade(avg);
				System.out.println("Student "+(i+1)+" "+getname(i)+" average "+avg+" grade "+grades[i]);
			}
			else if(i==2)
			{
				double avg=calcaverage(stud3);
				grades[i]=grade(avg);
				System.out.println("Student "+(i+1)+" "+getname(i)+" average "+avg+" grade "+grades[i]);
			}
			else if(i==3)
			{
				double avg=calcaverage(stud4);
				grades[i]=grade(avg);
				System.out.println("Student "+(i+1)+" "+getname(i)+" average "+avg+" grade "+grades[i]);
			}
			else if(i==4)
			{
				double avg=calcaverage(stud5);
				grades[i]=grade(avg);
				System.out.println("Student "+(i+1)+" "+getname(i)+" average "+avg+" grade "+grades[i]);
			}
		}
		
	}
	
}
