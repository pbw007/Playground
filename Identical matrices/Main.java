/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();
        int mat1 [] [] = new int [row][col];
        int mat2 [] [] = new int [row][col];
        for(int i = 0 ; i < row ; i++)
        {
            for(int j = 0 ; j < col ; j++ )
            {
                mat1 [i][j] = in.nextInt();
            }
        }
        
        for(int i = 0 ; i < row ; i++)
        {
            for(int j = 0 ; j < col ; j++ )
            {
                mat2 [i][j] = in.nextInt();
            }
        }
        
        
        boolean issame = false;
            for(int i = 0 ; i < row ; i++)
            {
                for(int j = 0 ;  j < row ; j++)
                {
                    if(mat1 [i][j] == mat2 [i][j])
                    {
                        issame = true;
                    }
                    else
                    {
                        issame = false;
                        System.out.print("No");
                        break;
                    }
                    
                }
                
               
                if(!issame)
                    {
                        
                        break;
                    }
            }
            if(issame)
            {
                System.out.print("Yes");
            }
        
        }
}
