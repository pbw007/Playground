import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      LinkedHashSet<String> lhs = new LinkedHashSet<String>();
      String ip = br.readLine();
      String  words[] = ip.split(",");
      for(int i = 0 ; i < words.length ; i++)
      {
        lhs.add(words[i]);
      }
      System.out.print(lhs);
    }
}