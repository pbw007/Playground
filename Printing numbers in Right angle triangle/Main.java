import java.util.Scanner;
class Main
{
public static void main(String args[])
{
		Scanner in = new Scanner(System.in);
		int n_row = in.nextInt();
        int n_col = 1; 
        int num = 1;
      
		for(int row = 1 ; row <= n_row ; row++) 
        {     
          
          for(int col = 1; col <= n_col ; col++ )
          {   
            System.out.print(num);

          }
          n_col++;
           num++;
           System.out.print("\n");
        }
}
} 