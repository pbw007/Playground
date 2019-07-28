import java.util.Scanner;
class Main
{
public static void main(String args[])
{
  Scanner in = new Scanner (System.in);
  int row_n = in.nextInt();
  int num = 1;
  int col_n = 1;
  int numbers = row_n;
  int col,spaces;
  int uperRow = 1;
  
    for(  ; uperRow <= row_n ; uperRow++ )
    {
      for(spaces = row_n-uperRow ; spaces>=1 ; spaces-- )
      {
        System.out.print(" ");
      }
      for( int uperCol = 1 ; uperCol <= uperRow ; num++, uperCol++ )
      {
        System.out.print(num);
        System.out.print(" ");
      }
      System.out.print("\n");
    }
}
}
