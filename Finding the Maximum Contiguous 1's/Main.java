/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
    	Scanner in = new Scanner(System.in);
    	int size = in.nextInt();
    	int arr[] = new int[size];
    	for(int i = 0 ; i < size ; i++)
    	{
    	    arr[i] = in.nextInt();
    	}
    	int count = 1;
    	int max_rep = 0;
    	for(int  i = 0 ; i < size-1 ; i++)
    	{
    	    if(arr[i] == arr[i+1] && arr[i] == 1)
    	    {
    	        count ++;
    	    }
    	    else
    	    {
    	    count = 0 ;
    	    }
    	    if (count > max_rep)
    	    {
    	        max_rep = count;
    	    }
    	}
    	System.out.print(max_rep);
      
    }
}