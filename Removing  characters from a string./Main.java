import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    String gayab = in.nextLine();
    StringBuilder sb = new StringBuilder(str);
    StringBuilder sb1 = new StringBuilder();
    int len1 = str.length();
    int len2 = gayab.length();
    for(int i = 0 ; i < len1 ; i++)
    {
        boolean not_same = false;
        for(int j = 0 ; j < len2 ; j++)
        {
            if(str.charAt(i) != gayab.charAt(j))
            {
               not_same = true ;
            }
            else
            {
                not_same = false;
                break;
            }
            
        }
        if(not_same)
        {
            sb1.append(str.charAt(i));
        }
    }
    System.out.print(sb1);
  }
}