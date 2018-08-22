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
		int p=s.nextInt();
		int t=s.nextInt();
		int r=s.nextInt();
		int sum=0;
		{
			sum=p*t*r/100;
		}
		System.out.println(sum);
	}
}
