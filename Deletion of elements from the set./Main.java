import java.io.*;
import java.lang.*;
import java.util.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      TreeSet<String> ts = new TreeSet<String>();
      String in = br.readLine();
      String [] words = in.split(",");
      for(int i = 0 ; i < words.length ; i++)
      {
        ts.add(words[i]);
      }
      System.out.println(ts);
      Object [] arr = ts.toArray();
      int last = arr.length-1;
      for(int i = 0 ; i < arr.length ; i++)
      {
        Object obj = arr[last];
        ts.remove(obj);
        last--;
        System.out.println(ts);
      }
      
    }
}