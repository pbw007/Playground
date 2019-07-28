import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      TreeMap tm = new TreeMap();
      int count = Integer.parseInt(br.readLine());
      System.out.println("Enter the number of values to be inserted in map:"+count);
      for(int i = 0; i < count ;i++)
      {
        String key = br.readLine();
        String val =br.readLine();
        tm.put(key,val);
      }
      System.out.println(tm);
      String remove = br.readLine();
      System.out.println("Enter the index to be removed:"+remove);
      tm.remove(remove);
       System.out.println(tm);
       String newKey =br.readLine();
      System.out.println("Enter the index to insert:"+newKey);
      String newVal =br.readLine();
       System.out.println("Enter the value to be inserted:"+newVal);
      tm.put(newKey,newVal);
      System.out.println(tm);
      
    }
}