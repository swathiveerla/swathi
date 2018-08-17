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
		String str=s.nextLine();
		String num=".*[0-9].*";
		String uppercase=".*[A-Z].*";
		String lowercase=".*[a-z].*";
		if(str.matches(num) && (str.matches(uppercase) || str.matches(lowercase)))
		{
		System.out.println("Yes");
		}
		else
		{
		System.out.println("No");
			
		}
	}
}
