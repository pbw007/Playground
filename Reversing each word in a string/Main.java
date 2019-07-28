import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    StringBuilder sb = new StringBuilder();
    int len = str.length();
    int start = 0 , end = 0 , count = 0;
  for(int i = 0 ; i < len ; i++)
  {
      if(str.charAt(i) != ' ')
      {
          count++;
      }
      
      if((str.charAt(i) == ' ') || (i == len-1))
      {
          end = count;
           
          for(int j = end-1 ; j >= start ; j--)
          {
             sb.append(str.charAt(j)); 
          }
          count++;
          start = count;
         sb.append(' ');
      }
  }
    System.out.print(sb);
  }
}
