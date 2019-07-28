import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      String str1 = in.nextLine();
      String str2 = in.nextLine();
      int parts = in.nextInt();
     String arr [] = str2.split (" " , parts);
      for(int i = 0 ; i < parts ; i++)
      {
        System.out.println( arr[i]);
      }
      
    }
}