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
		int N=s.nextInt();
		int M=N-1;
		if(N%2==0){
			System.out.println(N);
		}else{
		while(N!=0){
			if(M%2!=0){
				M=M-1;
			}else{
				break;
			}
		}
		System.out.println(M);
		}
	}
}
