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
		int m=s.nextInt();
		int gcd=1;
       for(int i = 1; i <= n && i <= m; ++i)
        {
            // Checks if i is factor of both integers
            if(n % i==0 && m % i==0)
                gcd = i;
        }

        System.out.println(gcd);
    }
}
