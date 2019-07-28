import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner (System.in);
    String str = in.nextLine();
    StringBuilder sb = new StringBuilder(str);
    StringBuilder sb1 = new StringBuilder();
    int len = str.length();
    char vovels[] = {'a','e','i','o','u','A','E','I','O','U'};
    for(int i = 0 ; i < len ; i++)
    {
      boolean notvovel = false;
      for(int j = 0 ; j < 10 ; j++)
      {
        
        if(str.charAt(i) != vovels[j])
        {
          notvovel = true;          
        }
        else
        {
          notvovel = false;
          break;
        }
      }
      if(notvovel)
      sb1.append(str.charAt(i));
    }
    System.out.print(sb1);
  }
}