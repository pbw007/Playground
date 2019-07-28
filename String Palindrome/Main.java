/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int len = str.length();
      
      int s = 0;
      for(int i = 0 ; i < len/2 ; i++)
      {
        if(str.charAt(i) == str.charAt((len-1)-i))
           {
             s++;
           }
           
      }
      
      if(s==len/2)
      {
          System.out.print("Yes");
      }
      else
      System.out.print("No");
      
    } 
}

