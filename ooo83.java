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
		int a=s.nextInt();
		char ch=s.next().charAt(0);
		int b=s.nextInt();
		switch(ch)
		{
			case'/':int res=a/b;
			System.out.println(res);
			break;
			case'%':res=a%b;
			System.out.println(res);
			break;
		}
	}
}
