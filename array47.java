/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] a=new int[10];
		int n,i,min,max;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		min=a[0];
		for(i=0;i<n;i++)
		{
			if(a[i]<min){
				min=a[i];
			}
		}
		max=0;
		for(i=0;i<n;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.print(min+" ");
		System.out.print(max);
	}
}
