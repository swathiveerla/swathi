/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1,count=0;
		while(i<=n)
		{
			if(n%i==0)
			{
				count++;
			}
			i++;
		}
		if(count>2)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
