/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
        LinkedHashMap lhm = new LinkedHashMap();
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int startSize = Integer.parseInt(br.readLine());
      System.out.println("Enter the number of values to be inserted in map:"+startSize);
      for(int i = 0 ; i < startSize ; i++)
      {
      String key = br.readLine();
      String val = br.readLine();
      lhm.put(key,val);
      }
      System.out.println(lhm);
      String remove = br.readLine();
      System.out.println("Enter the index to be removed:"+remove);
      lhm.remove(remove);
      System.out.println(lhm);
      int size = lhm.size();
      System.out.println("Size of map is : "+size);
    }
}