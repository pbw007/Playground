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
    	int max_repNum = arr[0];
    	for(int  i = 0 ; i < size-1 ; i++)
    	{
    	    if(arr[i] == arr[i+1] )
    	    {
    	        count ++;
    	    }
    	    else
    	    {
    	    count = 0 ;
    	    }
    	    if (count > max_rep)
    	    {
    	        max_repNum = arr[i];
    	        max_rep = count;
    	    }
    	}
    	System.out.print(max_repNum);
      
    }
}