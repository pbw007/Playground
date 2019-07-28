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
    int arr1[] = new int [size];
    int k = in.nextInt();
    for(int i = 0 ; i < size ; i ++)
    {
        arr[i] = in.nextInt();
    }
    
    
    for(int j = 1 ; j <= k ; j++)
    {
        int freq = 0;
       for(int i = 0 ; i < size ; i++)
      {
        if(arr[i] == j)
        {
          freq++;  
        }
      }
      arr1[j] = freq;
    }
    for(int i = 1 ; i <= k ; i ++)
    {
        System.out.print(i);
        System.out.print(" ");
        System.out.println(arr1[i]);
    }
        
        
  }

}
