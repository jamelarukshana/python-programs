	/* Even or Odd*/
import java.util.*;
import java.lang.*;
import java.io.*;
 
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner reader=new Scanner(System.in);
        int num=reader.nextInt();
        if(num%2==0)
            System.out.println("Even");
        else if(num%3==0)
            System.out.println("Odd");
        else
            System.out.println("invalid");
    }
}
 
