/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner in = new Scanner (System.in);
    int size = in.nextInt();
    int arr[] = new int [size];
    
    for(int i = 0 ; i < size ; i ++)
    {
        arr[i] = in.nextInt();
    }
    
    int k = in.nextInt();
    
    int max = arr[0];
    for(int  i = 0 ; i < size-1 ; i ++)
    {
        for(int  j = i+1 ; j < size ; j++)
        {
        if(arr[i] < arr[j])
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            
        }
        }
    }
    
        System.out.println(arr[k-1]);
    
    
  }

}
