//file name should be named as kk.java
package Class;
import java.util.*;
public class kk {
	private int temp;
	
	
	Scanner in=new Scanner(System.in);
	
	public void get()
	{
		System.out.printf("\nEnter Tempature:");
		temp=in.nextInt();
		in=null;
		if(temp<0)
		{
			System.out.printf("\nWater must have been as ice");
		}
		else if(temp<=100)
		{
			System.out.printf("\nWater Must have been as Water");
		}
		else if(temp>100)
		{
			System.out.printf("\nWater Must have been as stream");
		}
		
		
	}

}
