import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
       LinkedHashSet<String> lhs = new LinkedHashSet<String>();
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String str = br.readLine();
      String words[] = str.split(",");
      for(int i = 0 ; i < words.length ; i++)
      {
        lhs.add(words[i]);
      }
      System.out.println(lhs);
      System.out.print("Enter the value to be deleted: ");
      String removeNum =br.readLine();
      System.out.println(removeNum);
      lhs.remove(removeNum);
      System.out.println(lhs);
      
      System.out.print("Enter the value to be added: ");
      String addNum =br.readLine();
      System.out.println(addNum);
      lhs.add(addNum);
      System.out.println(lhs);
    }
}