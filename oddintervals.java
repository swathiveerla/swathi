/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		for(int i=m+1;i<n;i++)
		{
			if(i%2==0)
			{  
			  
			}
			else if(i<n-1)
			{ 
			  System.out.print(i+" ");
			}
			else
			  System.out.print(i);
		}
            }
}
