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
		String string = s.next();
                        boolean numeric = true;
                        try
                        {
                          Double num = Double.parseDouble(string);
                        }
                        catch (NumberFormatException e)
                        {
            numeric = false;
        }

        if(numeric)
            System.out.println("Yes");
        else
            System.out.println("No");
	}
}
