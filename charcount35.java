/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int count=0;
		String str;
		Scanner s=new Scanner(System.in);
		str =s.nextLine();
		int n=str.length();
		for(int i=0;i<n;i++)
		{
			char c=str.charAt(i);
			if(c>='0' && c<='9')
			{
				count++;
			}
		}
		System.out.print(count);
	}
}
