import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    
    int marks[] = new int[size]; 
    for(int i = 0 ; i < size ; i ++)
    {
      marks[i] = in.nextInt(); 
    }
   int sum1 = 0;
    int sum2 = 0;
    for(int i = 0 ; i < size/2;i ++ )
    {
    sum1= sum1+ marks[i];    
    }        
    for(int i = size/2 ; i < size ; i++ )
    {
     sum2 = sum2 + marks[i];
    }
    if(sum1 != size ||sum2 != size)
    {
       if(size!=9)
      System.out.print("Not a Perfect Batch");
    }
    if(size == 9 )
      System.out.print("Perfect Batch");
  }
}