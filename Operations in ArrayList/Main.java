import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      List<String> lhm = new LinkedList<String>();
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      
          
      while(true)
      {
          int functn = Integer.parseInt(br.readLine());
        System.out.println("Choose any one:");

        System.out.println("1.Insert");

        System.out.println("2.delete");

        System.out.println("3.Display");

        System.out.println("4.Exit");
        if(functn == 4)
        {
            break;
        }
      switch(functn){
      case 1 :
         String str = br.readLine();
          String words[] = str.split(",");
          
          for(int i = 0 ; i < words.length ; i++)
          {
              lhm.add(words[i]);
          }
          
          break;
          
      case 2:
         
          int deleteVal = Integer.parseInt(br.readLine());
           System.out.print("Enter the index value to be deleted:"+deleteVal);
          lhm.remove(deleteVal);
          System.out.println();
         
          break;
      case 3:
          System.out.println(lhm);
          break;
      case 4:
          break;
          
      }
      }
    }
}