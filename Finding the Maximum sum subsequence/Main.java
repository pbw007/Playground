/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
    public static int sum ( int start_idx, int end_idx, int arr[])
    {
        
        
        int add = 0;
        while(start_idx <= end_idx)
        {
           add = add + arr[start_idx];
           start_idx++;
        }
    
        return add;
    }
    
    
	public static void main(String[] args) {
		Scanner  in = new Scanner(System.in);
		int size = in.nextInt();
		int arr[] = new int [size];
		int arr1[] = new int [size*2];
		int arr2[] = new int [size];
		for(int i = 0 ; i < size ; i++)
		{
		    arr[i] = in.nextInt();
		}
		int count = 0;
		int j = 0;
		int arr1_size = 0;
		for(int  i = 0 ; i < size ; i++)
		{
		    if(i != size-1 )
		    {
		    if(arr[i+1] > arr[i])
		    {
		      if(count == 0)
		      {
		          arr1[j] = i;
		          j++;
		      }
		      count++;
		      arr1_size++;
		    }
		    else
		    {
		        arr1[j] = i;
		        j++;
		        count = 0;
		        arr1_size++;
		    }
		    }
		    else
		    {
		       if(arr[i] > arr[i-1] )
		       {
		           arr1[j]=i;
		           arr1_size++;
		       }
		       else
		       {
		           arr1[j]=i;
		           arr1[j+1]=i;
		           arr1_size++;
		       }
		    }
		}
		
		int  k = 0;
		for(int i = 0 ; i < arr1_size ; )
		{
		    int start_idx = arr1[i];
		    int end_idx = arr1[i+1];
		    
		    arr2[k] = sum(start_idx,end_idx,arr);
		    i = i + 2;
		    k++;
		}
		int max = arr2[0];
		for(int i = 0 ; i < k ; i++ )
		{
		    if(arr2[i] > max)
		    {
		        max = arr2[i];
		    }
		}
		System.out.print(max);
	}
}
