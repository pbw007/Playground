import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      ArrayList<String> al = new ArrayList<String>();
      
      String months =br.readLine();
      String check = br.readLine();
      String arr[] = months.split(",");
      for(int i = 0 ; i < arr.length ; i++)
      {
          al.add(arr[i]);
      }
      System.out.println(al);
     System.out.println("Size of the linked list: "+al.size());
     System.out.println("Is LinkedList empty? "+al.isEmpty());
     System.out.println("Does LinkedList contains "+ check+"?");
     System.out.println(al.contains(check));
    }
}