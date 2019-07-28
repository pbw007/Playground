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
    
    int largest = 0;
    
    for(int i = 0  ; i < size ; i ++ )
    {
      
      if (marks[i] > largest)
      {
          largest = marks[i];
      }
      }
      
    System.out.print(largest);
          
  }
}
