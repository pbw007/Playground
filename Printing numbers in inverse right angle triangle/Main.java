import java.util.Scanner;
class Main
{
public static void main(String args[])
{
  Scanner in = new Scanner (System.in);
  int row_n = in.nextInt();
   int num = 0;
      for(int row = 1 ; row <= row_n ; row++ )
      {
        for(int col = row_n-num ; col >= 1 ; col--)
        {
          System.out.print(col);
        }
        num++;
        System.out.print("\n");
      }
}
}