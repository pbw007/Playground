import java.util.Scanner;
public class Main 
{
    public static void main(String[] args)
    {
      Scanner in = new Scanner(System.in);
      int row = in.nextInt();
      int col = in.nextInt();
      int mat1[][] = new int[row][col];
      int transpose[][] = new int [col][row];
      
       
       
      for(int i = 0 ; i < row ; i++)
      {
          for(int j = 0 ; j < col ; j++)
          {
              mat1[i][j] = in.nextInt();
          }
          
      }
      for(int i = 0 ; i <row ; i++ )
      {
          for(int j = 0 ; j < col ; j++)
          {
              transpose [j][i] =  mat1[i][j];
          }
      }
     
     for(int i = 0 ; i <col ; i++ )
      {
          for(int j = 0 ; j < row ; j++)
          {
              System.out.print(transpose [i][j]+ " ");
          }
          System.out.println();
      }
     
      
      
      
      
      
         }
    }