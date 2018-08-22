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
		int l=s.nextInt();
		int m=s.nextInt();
		boolean flag=false;
		for(int i=l+1;i<m;i++)
		{
			if(n==i)
			flag =true;
		}
		if(flag==true)
		System.out.println("yes");
		else
		System.out.println("no");
		// your code goes here
	}
}
