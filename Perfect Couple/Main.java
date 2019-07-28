/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;
class Main 
{
    public static void secondLast(int arr [], int size , int val )
    {
       for(int i = 0 ; i < size ; i++) 
       {
           for(int j = i+1 ; j < size ; j++)
           {
             if(arr[i] + arr[j] == val)
               System.out.println(arr[i]+", "+arr[j]);
           }
           
       }
        
    }
    
    
    
     public static void main(String args[])
  {
    Scanner in = new Scanner (System.in);
    int size = in.nextInt();
    
    int arr[] = new int[size];
    
    

    for(int i = 0 ; i < size ; i++)
    {
        arr[i]= in.nextInt();
    }
    int val = in.nextInt();
    secondLast(arr,size,val);
  }
}


