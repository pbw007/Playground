/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    StringBuilder sb = new StringBuilder(str);
    int len = str.length();
    int shift = len/2;
    char arr[] = new char[shift];
   
    for(int i = 0 ; i < shift ; i++ )
    {
      arr[i] = str.charAt(i);
     
    }
    
    for(int i = shift ; i < len ; i++)
    {
        sb.setCharAt(i-shift,str.charAt(i));
    }
    for(int i = 0 ; i < shift ; i++)
    {
        sb.setCharAt(((len-1)-i), arr[(shift-1)-i]);
    }
    for(int row_n = 0 ; row_n < len ; row_n++)
    {
        for(int spaces = 0 ; spaces < len-row_n-1 ; spaces++)
        {
            System.out.print(" ");
        }
        for(int col_n = 0 ; col_n <= row_n;col_n++)
        {
            System.out.print(sb.charAt(col_n));
        }
        System.out.println();
    }
    
    
    
  }
}