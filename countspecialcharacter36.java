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
	int count=0;
	String str=s.nextLine();
	for(int i=0;i<str.length();i++)
	{
	if(str.charAt(i)>='0' && str.charAt(i)<='9' || str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)>='A' && str.charAt(i)<='Z'){
			continue;
		}
		else
		{
			count++;
		}
	
	}
	System.out.println(count);
}
}
