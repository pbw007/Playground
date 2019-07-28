import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner in = new Scanner(System.in);
      int row = in.nextInt();
      int col = in.nextInt();
      int n ;
      for(int row_n = 0 ; row_n < row ; row_n++)
      {
        n = row_n;
        for(int col_n = col ; col_n > 0 ; col_n-- )
        {
          if(n > 0)
          {
            System.out.print (col_n);
            n--;
          }
          else
          {
            System.out.print(row - row_n);
          }
          
        }
        System.out.println();
      }
    }
}