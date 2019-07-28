import java.util.Scanner;
class Main
{
public static void main(String args[])
{
  Scanner in = new Scanner (System.in);
  int row_n = in.nextInt();
  int num = 0;
  for( int row = 1 ; row <= row_n ; row++)
  {
    for(int space = 1 ; space <= (row_n - row) ; space++ )
    {
      System.out.print(" ");
    }
    for(int col_n = 1 ; col_n <= row + num  ; col_n++)
    {
      System.out.print("*");
    }
    num++;
    System.out.print( "\n" );
  }
}
}
  