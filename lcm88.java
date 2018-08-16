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
	  int n1=s.nextInt();
	  int n2=s.nextInt();
	  int gcd=1;
	  for(int i = 1; i <= n1 && i <= n2; ++i)
        {
            if(n1 % i == 0 && n2 % i == 0)
                gcd= i;
        }

        int lcm = (n1 * n2) / gcd;
        System.out.println(lcm);
            }
}
