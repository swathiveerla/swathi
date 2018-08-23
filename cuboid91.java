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
		int L=s.nextInt();
		int B=s.nextInt();
		int H=s.nextInt();
		int res=0;
		int vol=0;
		res=2*((L*B)+(B*H)+(L*H));
		vol=L*B*H;
		System.out.print(res+" ");
		System.out.print(vol);
	}
}
