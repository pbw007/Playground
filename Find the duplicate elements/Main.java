import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      TreeSet<String> ts = new TreeSet<String>();
      String in = br.readLine();
      String [] words = in.split(",");
      System.out.println("Duplicate Entry is:");
      for(int i = 0 ; i < words.length ; i++)
      {
       if(!ts.add(words[i]))
       {
         System.out.println(words[i]);
       }
      }
      System.out.print("TreeSet is : ");
      System.out.print(ts);
    }
}