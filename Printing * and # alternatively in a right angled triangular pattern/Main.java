import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		int n = in.nextInt();
        int col_n = 1;
        int starHash = 1;
      
           for( int row = 1 ; row <= n ; row++ )
           {
             for ( int col = 1 ; col <= col_n ; starHash++, col ++ )
             {
               if(starHash % 2 == 0)
               System.out.print("#");
               else
               System.out.print("*");  
             }
             col_n++;
             System.out.print("\n");
           }
    }
}